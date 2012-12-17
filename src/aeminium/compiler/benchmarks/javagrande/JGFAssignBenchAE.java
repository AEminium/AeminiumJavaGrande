package aeminium.compiler.benchmarks.javagrande;

/**************************************************************************
 * * Java Grande Forum Benchmark Suite - Version 2.0 * * produced by * * Java
 * Grande Benchmarking Project * * at * * Edinburgh Parallel Computing Centre *
 * * email: epcc-javagrande@epcc.ed.ac.uk * * * This version copyright (c) The
 * University of Edinburgh, 1999. * All rights reserved. * *
 **************************************************************************/
public class JGFAssignBenchAE {

	public static void main(String argv[]) {

		int a1 = 1, a2 = 2, a3 = 3, a4 = 4;
		int b[] = {1,2,3,4};

		int c1 = 1, c2 = 2, c3 = 3, c4 = 4;
		int d[] = {1,2,3, 4 };

		int i, size = 1000000000;
		double time;

		long start_time = 0;

		int e1 = 1, e2 = 2, e3 = 3, e4 = 4;
		int f[] = { 1, 2, 3, 4 };

		System.out.println("Section1:Assign:Same:Scalar:Local");
		time = 0.0;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			e1 = e2;
			e2 = e3;
			e3 = e4;
			e4 = e1;
			e1 = e2;
			e2 = e3;
			e3 = e4;
			e4 = e1;
			e1 = e2;
			e2 = e3;
			e3 = e4;
			e4 = e1;
			e1 = e2;
			e2 = e3;
			e3 = e4;
			e4 = e1;

			// try to defeat dead code elimination
			if (e4 == e3)
				System.out.println(e4);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Assign:Same:Scalar:Instance");
		time = 0.0;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			c1 = c2;
			c2 = c3;
			c3 = c4;
			c4 = c1;
			c1 = c2;
			c2 = c3;
			c3 = c4;
			c4 = c1;
			c1 = c2;
			c2 = c3;
			c3 = c4;
			c4 = c1;
			c1 = c2;
			c2 = c3;
			c3 = c4;
			c4 = c1;

			// try to defeat dead code elimination
			if (c4 == c3)
				System.out.println(c4);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Assign:Same:Scalar:Class");
		time = 0.0;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			a1 = a2;
			a2 = a3;
			a3 = a4;
			a4 = a1;
			a1 = a2;
			a2 = a3;
			a3 = a4;
			a4 = a1;
			a1 = a2;
			a2 = a3;
			a3 = a4;
			a4 = a1;
			a1 = a2;
			a2 = a3;
			a3 = a4;
			a4 = a1;

			// try to defeat dead code elimination
			if (a3 == a4)
				System.out.println(a3);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Assign:Same:Array:Local");
		time = 0.0;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			f[0] = f[1];
			f[1] = f[2];
			f[2] = f[3];
			f[3] = f[0];
			f[0] = f[1];
			f[1] = f[2];
			f[2] = f[3];
			f[3] = f[0];
			f[0] = f[1];
			f[1] = f[2];
			f[2] = f[3];
			f[3] = f[0];
			f[0] = f[1];
			f[1] = f[2];
			f[2] = f[3];
			f[3] = f[0];

			// try to defeat dead code elimination
			if (f[3] == f[2])
				System.out.println(f[3]);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Assign:Same:Array:Instance");
		time = 0.0;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			d[0] = d[1];
			d[1] = d[2];
			d[2] = d[3];
			d[3] = d[0];
			d[0] = d[1];
			d[1] = d[2];
			d[2] = d[3];
			d[3] = d[0];
			d[0] = d[1];
			d[1] = d[2];
			d[2] = d[3];
			d[3] = d[0];
			d[0] = d[1];
			d[1] = d[2];
			d[2] = d[3];
			d[3] = d[0];
			d[0] = d[1];
			d[1] = d[2];
			d[2] = d[3];
			d[3] = d[0];
			d[0] = d[1];
			d[1] = d[2];
			d[2] = d[3];
			d[3] = d[0];
			d[0] = d[1];
			d[1] = d[2];
			d[2] = d[3];
			d[3] = d[0];
			d[0] = d[1];
			d[1] = d[2];
			d[2] = d[3];
			d[3] = d[0];

			// try to defeat dead code elimination
			if (d[3] == d[2])
				System.out.println(d[3]);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Assign:Same:Array:Class");
		time = 0.0;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			b[0] = b[1];
			b[1] = b[2];
			b[2] = b[3];
			b[3] = b[0];
			b[0] = b[1];
			b[1] = b[2];
			b[2] = b[3];
			b[3] = b[0];
			b[0] = b[1];
			b[1] = b[2];
			b[2] = b[3];
			b[3] = b[0];
			b[0] = b[1];
			b[1] = b[2];
			b[2] = b[3];
			b[3] = b[0];

			// try to defeat dead code elimination
			if (b[3] == b[2])
				System.out.println(b[3]);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		a1 = 1;
		a2 = 2;
		a3 = 3;
		a4 = 4;

		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;

		c1 = 1;
		c2 = 2;
		c3 = 3;
		c4 = 4;

		d[0] = 1;
		d[1] = 2;
		d[2] = 3;
		d[3] = 4;

		System.out.println("Section1:Assign:Other:Scalar:Instance");
		time = 0.0;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			c1 = c2;
			c2 = c3;
			c3 = c4;
			c4 = c1;
			c1 = c2;
			c2 = c3;
			c3 = c4;
			c4 = c1;
			c1 = c2;
			c2 = c3;
			c3 = c4;
			c4 = c1;
			c1 = c2;
			c2 = c3;
			c3 = c4;
			c4 = c1;

			// try to defeat dead code elimination
			if (c3 == c4)
				System.out.println(c3);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Assign:Other:Scalar:Class");
		time = 0.0;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			a1 = a2;
			a2 = a3;
			a3 = a4;
			a4 = a1;
			a1 = a2;
			a2 = a3;
			a3 = a4;
			a4 = a1;
			a1 = a2;
			a2 = a3;
			a3 = a4;
			a4 = a1;
			a1 = a2;
			a2 = a3;
			a3 = a4;
			a4 = a1;

			// try to defeat dead code elimination
			if (a3 == a4)
				System.out.println(a3);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Assign:Other:Array:Instance");
		time = 0.0;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			d[0] = d[1];
			d[1] = d[2];
			d[2] = d[3];
			d[3] = d[0];
			d[0] = d[1];
			d[1] = d[2];
			d[2] = d[3];
			d[3] = d[0];
			d[0] = d[1];
			d[1] = d[2];
			d[2] = d[3];
			d[3] = d[0];
			d[0] = d[1];
			d[1] = d[2];
			d[2] = d[3];
			d[3] = d[0];

			// try to defeat dead code elimination
			if (d[3] == d[2])
				System.out.println(d[3]);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

		System.out.println("Section1:Assign:Other:Array:Class");
		time = 0.0;

		start_time = System.currentTimeMillis();
		i = 0;
		while (i < size) {
			b[0] = b[1];
			b[1] = b[2];
			b[2] = b[3];
			b[3] = b[0];
			b[0] = b[1];
			b[1] = b[2];
			b[2] = b[3];
			b[3] = b[0];
			b[0] = b[1];
			b[1] = b[2];
			b[2] = b[3];
			b[3] = b[0];
			b[0] = b[1];
			b[1] = b[2];
			b[2] = b[3];
			b[3] = b[0];

			// try to defeat dead code elimination
			if (b[3] == b[2])
				System.out.println(b[3]);

			i++;
		}

		time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

	}
}
