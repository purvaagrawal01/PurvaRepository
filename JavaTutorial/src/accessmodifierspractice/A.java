package accessmodifierspractice;

class A {

	private int i;

	public static void main(String[] args) {
		A a = new A();/* Since B is a inner class it can only b accessed from its parent obj*/
	//	B b = a.new B();/* Since B is a inner class it can only b accessed from its parent obj*/
		A.B b = new A.B(); // directly accessed thru class reference since B is a Static class
		b.pvtmethodOfClassB();
	}

	private void pvtmethodOfClassA() {
		System.out.println("In pvtmethodOfClassA");
		// Private Method
		System.out.println(i); // Private field can be used within class
		B b = new B(); // Private inner class can be used within class//Here method is called on obj so directly we can call create B's obj
		b.pvtmethodOfClassB();
	}

	public void pubmethodOfClassA() {// Public method can be used anywhere
		System.out.println("In pubmethodOfClassA");
		// Private Method
		System.out.println(i); // Private field can be used within class
		B b = new B(); // Private inner class can be used within class
		b.pvtmethodOfClassB();// Private method can be used within class
		b.pubmethodOfClassB();// Public method of inner class can be used within
								// class
		A a = new A();
		a.pvtmethodOfClassA();
	}

	private static class B {
		private void pvtmethodOfClassB() {
			System.out.println("pvtmethodOfClassB");
			// Private Inner Class
		}

		public void pubmethodOfClassB() {
			System.out.println("pubmethodOfClassB");
			// Private Inner Class
		}
	}
}
