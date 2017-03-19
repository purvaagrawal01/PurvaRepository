package practice;

/*A prime number is a whole number greater than 1, whose only two whole-number factors
 *  are 1 and itself. The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
 * 
 */
public class PrimeNo {

	@SuppressWarnings("unused")
	public static boolean isPrime(int n) {
		boolean isPrime = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				isPrime = false;
			else
				isPrime = true;
		}
		return isPrime;
	}

	public static void returnPrimeNumbers(int n) {

		for (int i = 1; i < n; i++) {
			if (isPrime(i))
				System.out.println(i);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 19;
		System.out.println(+n + " is Prime : " + isPrime(n));
		returnPrimeNumbers(n);
	}

}
