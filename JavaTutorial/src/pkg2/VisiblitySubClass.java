package pkg2;


import polymorphism.VisiblitySuperClass;

public class VisiblitySubClass extends VisiblitySuperClass{
	
	    private void methodOfSuperClass()
	    {
	        //Compile time error, can't reduce visibility of overrided method
	        //here, visibility must be protected or public but not private or default
	    }
	}

}
