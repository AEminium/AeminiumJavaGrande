/**************************************************************************
 *                                                                         *
 *             Java Grande Forum Benchmark Suite - Version 2.0             *
 *                                                                         *
 *                            produced by                                  *
 *                                                                         *
 *                  Java Grande Benchmarking Project                       *
 *                                                                         *
 *                                at                                       *
 *                                                                         *
 *                Edinburgh Parallel Computing Centre                      *
 *                                                                         * 
 *                email: epcc-javagrande@epcc.ed.ac.uk                     *
 *                                                                         *
 *                                                                         *
 *      This version copyright (c) The University of Edinburgh, 1999.      *
 *                         All rights reserved.                            *
 *                                                                         *
 **************************************************************************/

package aeminium.compiler.benchmarks.javagrande;

import java.util.Random;

public class JGFFFTBenchAE {

	public static void main(String[] args) {

		System.out.println("Section2:FFT:Kernel");

		long start_time = System.currentTimeMillis();

		double JDKtotal = 0.0;
		double JDKtotali = 0.0;

		int size = 16777216;

		long RANDOM_SEED = 10101010;

		Random R = new Random(RANDOM_SEED);

		double x[] = RandomVector(2 * (size), R);

		JDKtotal = transform(x, JDKtotal);
		JDKtotali = inverse(x, JDKtotali);

		double dev = Math.abs(JDKtotal - 13.815703907167297);
		double devi = Math.abs(JDKtotali - 16.778094422092604);
		if (dev > 1.0e-12) {
			System.out.println("Validation failed");
			System.out.println("JDKtotal = " + JDKtotal + "  " + dev + "  "
					+ size);
		}
		if (devi > 1.0e-12) {
			System.out.println("Validation failed");
			System.out.println("JDKtotalinverse = " + JDKtotali + "  " + dev
					+ "  " + size);
		}

		System.gc();

		double time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

	}

	/** Compute Fast Fourier Transform of (complex) data, in place. */
	public static double transform(double data[], double JDKtotal) {
		int JDKrange;

		transform_internal(data, -1);

		JDKrange = (data).length;

		int i = 0;
		while (i < JDKrange) {
			JDKtotal += data[i];
			i++;
		}

		return JDKtotal;

	}

	/** Compute Inverse Fast Fourier Transform of (complex) data, in place. */
	public static double inverse(double data[], double JDKtotali) {

		transform_internal(data, +1);
		// Normalize
		int nd = (data).length;
		int n = nd / 2;
		double norm = 1 / ((double) n);

		int i = 0;
		while (i < nd) {
			data[i] *= norm;
			i++;
		}

		i = 0;
		while (i < nd) {
			JDKtotali += data[i];
			i++;
		}

		return JDKtotali;

	}

	/** Make a random array of n (complex) elements. */
	public static double[] makeRandom(int n) {
		int nd = 2 * n;
		double data[] = new double[nd];

		int i = 0;
		while (i < nd) {
			data[i] = Math.random();
			i++;
		}
		return data;
	}

	protected static int log2(int n) {
		int log = 0;
		int k = 1;
		while (k < n) {
			k *= 2;
			log++;
		}
		if (n != (1 << log))
			throw new Error("FFT: Data length is not a power of 2!: " + n);
		return log;
	}

	protected static void transform_internal(double data[], int direction) {
		int n = (data).length / 2;
		if (n == 1)
			return; // Identity operation!
		int logn = log2(n);

		/* bit reverse the input data for decimation in time algorithm */
		bitreverse(data);

		/* apply fft recursion */
		int bit = 0;
		int dual = 1;
		while (bit < logn) {
			double w_real = 1.0;
			double w_imag = 0.0;

			double theta = 2.0 * direction * Math.PI / (2.0 * (double) dual);
			double s = Math.sin(theta);
			double t = Math.sin(theta / 2.0);
			double s2 = 2.0 * t * t;

			/* a = 0 */
			int b = 0;
			while (b < n) {
				int i = 2 * b;
				int j = 2 * (b + dual);

				double wd_real = data[j];
				double wd_imag = data[j + 1];

				data[j] = data[i] - wd_real;
				data[j + 1] = data[i + 1] - wd_imag;
				data[i] += wd_real;
				data[i + 1] += wd_imag;

				b += 2 * dual;
			}

			/* a = 1 .. (dual-1) */
			int a = 1;
			while (a < dual) {
				/* trignometric recurrence for w-> exp(i theta) w */
				{
					double tmp_real = w_real - s * w_imag - s2 * w_real;
					double tmp_imag = w_imag + s * w_real - s2 * w_imag;
					w_real = tmp_real;
					w_imag = tmp_imag;
				}
				b = 0;
				while (b < n) {
					int i = 2 * (b + a);
					int j = 2 * (b + a + dual);

					double z1_real = data[j];
					double z1_imag = data[j + 1];

					double wd_real = w_real * z1_real - w_imag * z1_imag;
					double wd_imag = w_real * z1_imag + w_imag * z1_real;

					data[j] = data[i] - wd_real;
					data[j + 1] = data[i + 1] - wd_imag;
					data[i] += wd_real;
					data[i + 1] += wd_imag;

					b += 2 * dual;
				}

				a++;
			}

			bit++;
			dual *= 2;
		}
	}

	protected static void bitreverse(double data[]) {
		/* This is the Goldrader bit-reversal algorithm */
		int n = (data).length / 2;

		int i = 0;
		int j = 0;
		while (i < n - 1) {
			int ii = 2 * i;
			int jj = 2 * j;
			int k = n / 2;
			if (i < j) {
				double tmp_real = data[ii];
				double tmp_imag = data[ii + 1];
				data[ii] = data[jj];
				data[ii + 1] = data[jj + 1];
				data[jj] = tmp_real;
				data[jj + 1] = tmp_imag;
			}

			while (k <= j) {
				j = j - k;
				k = k / 2;
			}
			j += k;

			i++;
		}
	}

	public static double[] RandomVector(int N, java.util.Random R) {
		double A[] = new double[N];

		int i = 0;
		while (i < N) {
			A[i] = R.nextDouble() * 1e-6;
			i++;
		}

		return A;
	}
}
