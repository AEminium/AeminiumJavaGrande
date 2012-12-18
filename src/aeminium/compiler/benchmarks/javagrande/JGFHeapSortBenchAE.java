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

public class JGFHeapSortBenchAE {

	public static void main(String[] args) {

		System.out.println("Section2:HeapSort:Kernel");

		long start_time = System.currentTimeMillis();

		int size = 25000000;

		int array_rows;
		int[] TestArray;

		array_rows = size;

		TestArray = new int[array_rows];

		Random rndnum = new Random(1729); // Same seed every time.

		// Fill first TestArray with pseudo-random values.

		int i = 0;
		
		System.out.println("Section2:HeapSort:Kernel");
		while (i < array_rows) {
			TestArray[i] = rndnum.nextInt();
			i++;
		}
		
		System.out.println("Section2:HeapSort:Kernel2");

		int temp; // Used to exchange elements.
		int top = array_rows - 1; // Last index in array. First is zero.

		// First, build a heap in the array. Sifting moves larger
		// values toward bottom of array.

		i = top / 2;
		while (i > 0) {
			TestArray = NumSift(i, top, TestArray);
			--i;
		}
		System.out.println("Section2:HeapSort:Kernel");
		// Repeatedly extract maximum from heap and place it at the
		// end of the array. When we get done, we'll have a sorted
		// array.

		i = top;
		while (i > 0) {
			TestArray = NumSift(0, i, TestArray);

			// Exchange bottom element with descending top.

			temp = TestArray[0];
			TestArray[0] = TestArray[i];
			TestArray[i] = temp;

			--i;
		}
		
		System.out.println("Section2:HeapSort:Kernel");

		boolean error;

		error = false;
		i = 1;
		while (i < array_rows) {
			error = (TestArray[i] < TestArray[i - 1]);
			if (error) {
				System.out.println("Validation failed");
				System.out.println("Item " + i + " = " + TestArray[i]);
				System.out
						.println("Item " + (i - 1) + " = " + TestArray[i - 1]);
				i = Integer.MAX_VALUE;
			}

			i++;
		}
		
		System.out.println("Section2:HeapSort:Kernel");

		TestArray = null; // Destroy the array.
		System.gc(); // Force garbage collection.
		
		System.out.println("Section2:HeapSort:Kernel");

		double time = (double) (System.currentTimeMillis() - start_time) / 1000.;
		System.out.println("Time= " + time);

	}

	public static int[] NumSift(int min, int max, int[] TestArray) // Sort
																	// range
	// offsets.
	{
		int k; // Used for index arithmetic.
		int temp; // Used for exchange.

		while ((min + min) <= max) {
			k = min + min;
			if (k < max)
				if (TestArray[k] < TestArray[k + 1])
					++k;
			if (TestArray[min] < TestArray[k]) {
				temp = TestArray[k];
				TestArray[k] = TestArray[min];
				TestArray[min] = temp;
				min = k;
			} else
				min = max + 1;
		}

		return TestArray;
	}
}
