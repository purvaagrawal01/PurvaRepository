package practice;

public class Patterns2 {

	public static void displayPattern7(int n) {

		for (int i = 1; i < n; i++) {
			for (int j = i; j >= 1; j--) {

				System.out.print(j);
			}
			System.out.println("");
		}
	}

	public static void displayPattern8(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = n - i; j >= 0; j--) {
				System.out.print("  ");
			}

			for (int j = 1; j <= i; j++) {

				int k = j * j;
				System.out.print(k + " ");
				// System.out.print("*");
			}
			for (int j = i + 1; j >= 1; j--) {

				int k = j * j;
				System.out.print(k + " ");
				// System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;

		displayPattern7(n);
		System.out.println("--------------------------------");

		displayPattern8(n);
		System.out.println("--------------------------------");
	}
}