package practice;

public class DuplicateChar {
	public static char[] duplicateChar(String s) {
		char[] c = new char[10];
		int sl = s.length();

		for (int i = 0; i <= sl-1; i++) {
			for (int j = 0; j <= sl-1; j++) {
				if (i != j) {
					if (s.charAt(i) == s.charAt(j)) {
						c[i] = s.charAt(i);
						System.out.println(c[i]);
					}
				}
			}
		}

		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		duplicateChar("amann");

	}

}
