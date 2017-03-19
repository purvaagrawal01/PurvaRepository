package polymorphism;

public class Casting {
	public static void main(String[] args) {
		/*
		 * Type of reference determines what methods u can call and type of
		 * object determines which method (which method implementation)to be
		 * called.
		 */

		System.out.println("-----ClassObj.method------");
		Parent parent1 = new Parent();
		Child child1 = new Child();
		parent1.method1();
		child1.method1();
		child1.method2();
		// Upcasting
		System.out.println("------Upcasting------");
		Parent parent2 = new Child();
		parent2.method1();
		// parent2.method2();//The method method2() is undefined for the type
		// Parent
		// method

		// Downcasting (In order to access method2)
		/*
		 * Make sure the Object variable(Parent reference)that u are downcasting
		 * really does refer to the kind of object that u are trying to downcast
		 * to
		 */

		System.out.println("-------Downcasting-------");
		Parent parent3 = new Child();
		Child child3 = (Child) parent3;
		child3.method1();
		child3.method2();

		/*
		 * //ClassCastException
		 * System.out.println("-------ClassCastException-------");
		 * // You can't downcast the Parent class object.
		 * Parent parent4 = new Parent(); 
		 * Child child4 = (Child) parent4;
		 * child4.method1(); child4.method2();
		 */

		// ClassCastException
		System.out.println("-------ClassCastException-------");
		Child child4 = new Child();
		Parent parent4 = (Parent) child4;
		parent4.method1();
		// parent4.method2();//The method method2() is undefined for the type
		// Parent

	}
}

class Parent {
	public void method1() {
		System.out.println("Parent Method1");
	}
}

class Child extends Parent {
	public void method1() {
		System.out.println("Child Method1");

	}

	public void method2() {
		System.out.println("Child Method2");

	}
}
