package accessmodifierspractice;

class C {
	public static void main(String[] args) {
		 //void methodOfClassC()
		    //{
		      //  System.out.println(i);  Private member can not be inherited
		System.out.println("In Class C");
		        A a = new A();
		        a.pubmethodOfClassA();
		        
		        //System.out.println(a.i);     Private field can not be used outside the class
		        //a.methodOfClassA();          Private method can not be used outside the class
		        //A.B b = new A.B();           Private inner class can not be used outside the class
		   // }
	}
}
