package practice;

public class ReverseString {
	
	public static void displayReverseString(String s) {
		int j = s.length();
		StringBuffer str=new StringBuffer();
		System.out.println("Original String :" + s);
	
		for (int i = j - 1; i >= 0; i--) {
			char c = s.charAt(i);
			str.append(c);
			
			

		}
		System.out.println("Reverse String :"+str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayReverseString("abcde");
	}
}
