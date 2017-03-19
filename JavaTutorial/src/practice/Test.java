package practice;

public class Test {

	static void m(Integer i, Integer n) {
		System.out.println("int int");
	}

	static void m(Integer... i) {
		System.out.println("Integer...");
	}

	public static void main(String args[]) {
		int s1 = 30, s2 = 40;
		m(s1, s2, s1);
	}
}
