package practice;

public class Patterns {

	public static void displayPattern1(int n) {

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void displayPattern2(int n) {

		for (int i = 0; i < n - 1; i++) {
			for (int j = 1; j <= (n - i - 1); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i + 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 1; j <= (n - i - 1); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i + 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void displayPattern3(int n) {

		for (int i = 1; i <= n; i++) {
			int temp = i;
			for (int j = 1; j <= i; j++) {
				for (int k = i - 1; k < i; k++) {
					System.out.print(temp + " ");
					temp++;
				}
			}
			System.out.println("");
		}
	}

	public static void displayPattern3_1(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = i,  k = 1; k <= i; k++, j++) {
					System.out.print(j + " ");
				
			}
			System.out.println("");
		}
	}

	
	public static void displayPattern4(int n) {
		for (int i = 1; i <= n; i++) {
			int temp1 = i;
			for (int j = 1; j <= i; j++) {

				for (int k = i - 1; k < i; k++) {
					System.out.print(temp1 + " ");
					temp1 = temp1 * i;
				}
			}
			System.out.println("");
		}
	}

	public static void displayPattern5(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {

				System.out.print(" ");
			}

			for (int j = 1; j < (2 * i); j++) {
				if (j <= i)
					System.out.print(j);
				if (j > i) {
					int p = (2 * i) - j;
					System.out.print(p);

				}
			}

			System.out.println("");

		}

		for (int i = n; i > 0; i--) {
			for (int j = i + 1; j <= n; j++) {

				System.out.print(" ");
			}

			for (int j = 1; j < (2 * i); j++) {

				if (j <= i)
					System.out.print(j);
				if (j > i) {
					int p = (2 * i) - j;
					System.out.print(p);

				}
			}

			System.out.println("");
		}

	}

	public static void displayPattern6(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 1; j < (2 * i); j++) {
				if (j <= i)
					System.out.print(j + " ");
				if (j > i)
					System.out.print(j + " ");
			}
			System.out.println("");
		}
		for (int i = n; i > 0; i--) {

			for (int j = 1; j < (2 * i); j++) {

				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		displayPattern1(n);
		System.out.println("--------------------------------");
		displayPattern2(n);
		System.out.println("--------------------------------");
		displayPattern3_1(n);
		System.out.println("--------------------------------");
		displayPattern4(n);
		System.out.println("--------------------------------");
		displayPattern5(n);
		System.out.println("--------------------------------");
		displayPattern6(n);

	}

}
