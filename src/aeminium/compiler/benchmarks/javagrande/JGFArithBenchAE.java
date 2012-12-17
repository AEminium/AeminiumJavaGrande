/**************************************************************************
 * * Java Grande Forum Benchmark Suite - Version 2.0 * * produced by * * Java
 * Grande Benchmarking Project * * at * * Edinburgh Parallel Computing Centre *
 * * email: epcc-javagrande@epcc.ed.ac.uk * * * This version copyright (c) The
 * University of Edinburgh, 1999. * All rights reserved. * *
 **************************************************************************/

package aeminium.compiler.benchmarks.javagrande;

public class JGFArithBenchAE {

	public static void main(String argv[]) {

		int i, size;
		double time;

		int i1, i2, i3, i4;
		long l1, l2, l3, l4, start_time = 0;
		float f1, f2, f3, f4;
		double d1, d2, d3, d4;

		System.out.println("Section1:Arith:Add:Int,adds");

		time = 0.0;
		size = 100000;
		i1 = 1;
		i2 = -2;
		i3 = 3;
		i4 = -4;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			i2 += i1;
			i3 += i2;
			i4 += i3;
			i1 += i4;
			i2 += i1;
			i3 += i2;
			i4 += i3;
			i1 += i4;
			i2 += i1;
			i3 += i2;
			i4 += i3;
			i1 += i4;
			i2 += i1;
			i3 += i2;
			i4 += i3;
			i1 += i4;

			// try to defeat dead code elimination
			if (i1 == i2)
				System.out.println(i1);
			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Arith:Add:Long,adds");

		time = 0.0;
		l1 = 1L;
		l2 = -2L;
		l3 = 3L;
		l4 = -4L;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			l2 += l1;
			l3 += l2;
			l4 += l3;
			l1 += l4;
			l2 += l1;
			l3 += l2;
			l4 += l3;
			l1 += l4;
			l2 += l1;
			l3 += l2;
			l4 += l3;
			l1 += l4;
			l2 += l1;
			l3 += l2;
			l4 += l3;
			l1 += l4;

			// try to defeat dead code elimination
			if (i1 == i2)
				System.out.println(i1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Arith:Add:Float,adds");

		time = 0.0;
		f1 = 1.0F;
		f2 = -2.0F;
		f3 = 3.0F;
		f4 = -4.0F;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			f2 += f1;
			f3 += f2;
			f4 += f3;
			f1 += f4;
			f2 += f1;
			f3 += f2;
			f4 += f3;
			f1 += f4;
			f2 += f1;
			f3 += f2;
			f4 += f3;
			f1 += f4;
			f2 += f1;
			f3 += f2;
			f4 += f3;
			f1 += f4;

			// try to defeat dead code elimination
			if (f1 == 0.5)
				System.out.println(f1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Arith:Add:Double,adds");

		time = 0.0;
		d1 = 1.0D;
		d2 = -2.0D;
		d3 = 3.0D;
		d4 = -4.0D;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			d2 += d1;
			d3 += d2;
			d4 += d3;
			d1 += d4;
			d2 += d1;
			d3 += d2;
			d4 += d3;
			d1 += d4;
			d2 += d1;
			d3 += d2;
			d4 += d3;
			d1 += d4;
			d2 += d1;
			d3 += d2;
			d4 += d3;
			d1 += d4;

			// try to defeat dead code elimination
			if (d1 == 0.5)
				System.out.println(d1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Arith:Mult:Int,multiplies");

		time = 0.0;
		i1 = 1;
		i2 = -2;
		i3 = 3;
		i4 = -4;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			i2 *= i1;
			i3 *= i2;
			i4 *= i3;
			i1 *= i4;
			i2 *= i1;
			i3 *= i2;
			i4 *= i3;
			i1 *= i4;
			i2 *= i1;
			i3 *= i2;
			i4 *= i3;
			i1 *= i4;
			i2 *= i1;
			i3 *= i2;
			i4 *= i3;
			i1 *= i4;

			// try to defeat dead code elimination
			if (i1 == i2 - 1)
				System.out.println(i1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Arith:Mult:Long,multiplies");

		time = 0.0;
		l1 = 1L;
		l2 = -2L;
		l3 = 3L;
		l4 = -4L;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			l2 *= l1;
			l3 *= l2;
			l4 *= l3;
			l1 *= l4;
			l2 *= l1;
			l3 *= l2;
			l4 *= l3;
			l1 *= l4;
			l2 *= l1;
			l3 *= l2;
			l4 *= l3;
			l1 *= l4;
			l2 *= l1;
			l3 *= l2;
			l4 *= l3;
			l1 *= l4;

			// try to defeat dead code elimination
			if (l1 == l2 - 1)
				System.out.println(l1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Arith:Mult:Float,multiplies");

		time = 0.0;
		// prevent overflow
		f2 = (float) Math.PI;
		f3 = 1.0F / f2;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			f1 *= f2;
			f1 *= f3;
			f1 *= f2;
			f1 *= f3;
			f1 *= f2;
			f1 *= f3;
			f1 *= f2;
			f1 *= f3;
			f1 *= f2;
			f1 *= f3;
			f1 *= f2;
			f1 *= f3;
			f1 *= f2;
			f1 *= f3;
			f1 *= f2;
			f1 *= f3;

			// try to defeat dead code elimination
			if (f1 == 0.5)
				System.out.println(f1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Arith:Mult:Double,multiplies");

		time = 0.0;
		// prevent overflow
		d2 = Math.PI;
		d3 = 1.0D / d3;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			d1 *= d2;
			d1 *= d3;
			d1 *= d2;
			d1 *= d3;
			d1 *= d2;
			d1 *= d3;
			d1 *= d2;
			d1 *= d3;
			d1 *= d2;
			d1 *= d3;
			d1 *= d2;
			d1 *= d3;
			d1 *= d2;
			d1 *= d3;
			d1 *= d2;
			d1 *= d3;

			// try to defeat dead code elimination
			if (d1 == 0.5)
				System.out.println(d1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Arith:Div:Int,divides");

		time = 0.0;
		i1 = Integer.MAX_VALUE;
		i2 = 3;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			i1 /= i2;
			if (i1 == 0)
				i1 = Integer.MAX_VALUE;

			// try to defeat dead code elimination
			if (i1 == -1)
				System.out.println(i1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Arith:Div:Long,divides");

		time = 0.0;
		l1 = Long.MAX_VALUE;
		l2 = 3L;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			l1 /= l2;
			if (l1 == 0)
				l1 = Long.MAX_VALUE;

			// try to defeat dead code elimination
			if (l1 == -1)
				System.out.println(l1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Arith:Div:Float,divides");

		time = 0.0;
		// prevent overflow
		f2 = (float) Math.PI;
		f3 = 1.0F / f2;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			f1 /= f2;
			f1 /= f3;
			f1 /= f2;
			f1 /= f3;
			f1 /= f2;
			f1 /= f3;
			f1 /= f2;
			f1 /= f3;
			f1 /= f2;
			f1 /= f3;
			f1 /= f2;
			f1 /= f3;
			f1 /= f2;
			f1 /= f3;
			f1 /= f2;
			f1 /= f3;

			// try to defeat dead code elimination
			if (f1 == 0.5)
				System.out.println(f1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Arith:Div:Double,divides");

		time = 0.0;
		// prevent overflow
		d2 = Math.PI;
		d3 = 1.0D / d3;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			d1 /= d2;
			d1 /= d3;
			d1 /= d2;
			d1 /= d3;
			d1 /= d2;
			d1 /= d3;
			d1 /= d2;
			d1 /= d3;
			d1 /= d2;
			d1 /= d3;
			d1 /= d2;
			d1 /= d3;
			d1 /= d2;
			d1 /= d3;
			d1 /= d2;
			d1 /= d3;

			// try to defeat dead code elimination
			if (d1 == 0.5)
				System.out.println(d1);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

	}
}