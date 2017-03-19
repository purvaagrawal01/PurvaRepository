package practice;

/*a series of numbers in which each number ( Fibonacci number ) is the sum of the two 
 * preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
 */

public class Fibonacci {

	static void displayFibonacci(int n) {
		int a[] = new int[n + 3];
		int cond = a.length - 2;
		a[0] = 0;
		a[1] = 1;

		for (int i = 0; i < cond; i++) {

			a[i + 2] = a[i] + a[i + 1];
			if (i != 0)
				System.out.println(" " + a[i]);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayFibonacci(19);
	}
}
