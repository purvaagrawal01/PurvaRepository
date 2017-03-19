package accessmodifiers;

public class A {
	int x;
	public int y;
	private int z;
	protected int t;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(a.z);
		System.out.println(a.t);
		System.out.println();
		System.out.println("Testing Commit");
		System.out.println("Testing Commit2");
		System.out.println("Testing Commit3");
		System.out.println("Testing Commit4");
		System.out.println("Testing Commit5");
	}

	void display()
	{
		System.out.println("Line1");
		System.out.println("Line2");
		System.out.println("Line3");
		System.out.println("Line4");
		System.out.println("Line5");
	}
}
