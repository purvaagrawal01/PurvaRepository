package accessmodifierspractice;

class E extends D
{ 
	  E(int i,int j) //Implicit super constructor D() is not visible because it is a private constructor. Must explicitly invoke another constructor
	    {
	        super(i,j);
	    }
    //Can't create subclass to the class
    //which has only private constructors

public static void main(String[] args) {
	D d=new D(2,4);
}
}