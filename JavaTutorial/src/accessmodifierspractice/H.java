package accessmodifierspractice;

class H extends F {
	public static void main(String[] args) {

		//System.out.println(i); // Default field can be inherited within package

		F a = new F();
		System.out.println(a.i); // Default field can be used within the package
		
		a.methodOfClassF(); // Default method can be used within the package
		F f=new F();
		G b = f.new G(); // Default inner class can be used within the package

	}
}