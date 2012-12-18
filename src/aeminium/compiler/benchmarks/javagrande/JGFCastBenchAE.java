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

public class JGFCastBenchAE {

	public static void main(String argv[]) {

		int i, size = Integer.MAX_VALUE;
		double time;

		int i1 = 0;
		long l1 = 0;
		float f1 = 0.0F;
		double d1 = 0.0D;

		long start_time = 0;

		System.out.println("Section1:Cast:IntFloat");

		time = 0.0;
		i1 = 6;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;
			f1 = (float) i1;
			i1 = (int) f1;

			// try to defeat dead code elimination
			if (f1 == -1.0F)
				System.out.println(f1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Cast:IntDouble");

		time = 0.0;
		i1 = 6;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;
			d1 = (double) i1;
			i1 = (int) d1;

			// try to defeat dead code elimination
			if (d1 == -1.0D)
				System.out.println(d1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Cast:LongFloat");

		time = 0.0;
		l1 = 7;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;
			f1 = (float) l1;
			l1 = (long) f1;

			// try to defeat dead code elimination
			if (f1 == -1.0F)
				System.out.println(f1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Cast:LongDouble");

		time = 0.0;
		l1 = 7;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;
			d1 = (double) l1;
			l1 = (long) d1;

			// try to defeat dead code elimination
			if (d1 == -1.0D)
				System.out.println(d1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

	}
}
