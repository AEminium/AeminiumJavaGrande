package aeminium.compiler.benchmarks.matrixmultiplication;

class MatrixMultiplicationAE {
	public static void main(String args[]) {

		double starttime = System.nanoTime();

		int m, n, p, q, sum = 0, c, d, k;

		// Scanner in = new Scanner(System.in);
		// System.out.println("Enter the number of rows and columns of first matrix");
		// m = in.nextInt();
		// n = in.nextInt();
		m = 1920;
		n = 1920;

		int first[][] = new int[m][n];

		// System.out.println("Enter the elements of first matrix");

		c = 0;
		while (c < m) {
			d = 0;
			while (d < n) {
				first[c][d] = d * c;
				// first[c][d] = in.nextInt();
				d++;
			}
			c++;
		}

		// System.out.println("Enter the number of rows and columns of second matrix");
		// p = in.nextInt();
		// q = in.nextInt();
		p = 1920;
		q = 1920;

		if (n != p)
			System.out
					.println("Matrices with entered orders can't be multiplied with each other.");
		else {
			int second[][] = new int[p][q];
			int multiply[][] = new int[m][q];

			// System.out.println("Enter the elements of second matrix");

			c = 0;
			while (c < p) {
				d = 0;
				while (d < q) {
					second[c][d] = d * c;
					d++;
				}
				// second[c][d] = in.nextInt();
				c++;
			}

			c = 0;
			while (c < m) {
				d = 0;
				while (d < q) {
					k = 0;
					while (k < p) {
						sum = sum + first[c][k] * second[k][d];
						k++;
					}

					multiply[c][d] = sum;
					sum = 0;
					d++;
				}
				c++;
			}

			System.out.println("Product of entered matrices:-");

			// c = 0;
			// while (c < m) {
			// d = 0;
			// while (d < q) {
			// System.out.print(multiply[c][d] + "\t");
			// d++;
			// }
			//
			// System.out.print("\n");
			// c++;
			// }

			starttime = System.nanoTime() - starttime;
			System.out.println("Time= " + starttime / 1000000000);
		}
	}
}