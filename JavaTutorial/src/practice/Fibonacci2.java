package practice;

/*a series of numbers in which each number ( Fibonacci number ) is the sum of the two 
 * preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
 */

public class Fibonacci2 {

	static void displayFibonacci(int n) {

		int a1 = 0;
		int a2 = 1;
		int a3;

		for (int i = 2; i < n; i++) {

			a3 = a1 + a2;
			a1 = a2;
			a2 = a3;
		
				System.out.println(" " + a3);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayFibonacci(19);
	}
}
