package practice;

/* A palindromic number or numeral palindrome is a number that remains the same 
 * when its digits are reversed. Like 16461, for example, it is "symmetrical".*/
public class Palindrome {

	public static boolean palindrome(int k) {
		boolean result = false;
		int a1 = k % 10;
		int a2 = k / 10;
		int a3 = a1;

		for (int i = 1; a2 > 0; i++) {

			a1 = a2 % 10;
			a2 = a2 / 10;
			a3 = (a3 * 10) + a1;
		}
		if (k == a3)
		result=true;
		System.out.println(result);
		return result;
	}

	public static boolean palindrome(String s) {
		boolean result = false;

		int j = s.length();
		// System.out.println(j);
		for (int i = 0; i < j / 2; i++) {
			/*
			 * System.out.println("s.charAt(i)"+s.charAt(i));
			 * System.out.println("s.charAt(j-1)"+s.charAt(j-1));
			 */
			if (s.charAt(i) != s.charAt(j - i - 1)) {
				System.out.println("not matched");
				return false;
			}
		}
		System.out.println("matched");
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String[] s = new String[]{"abcba"};
		// palindrome("abcddcba");
		palindrome(12345);
		palindrome(1234554321);
		palindrome(121212121);
		palindrome(3333333);
		palindrome(12312321);
	}

}
