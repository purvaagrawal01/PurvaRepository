package polymorphism;

class SubClass extends SuperClass
{
   void firstMethodOfSuperClass()
    {
       System.out.println("firstMethodOfSuperClass in Subclass");
       //Compile time error, return type must be void not int
  
    }
 
    double secondMethodOfSuperClass()
    {
        //Complie time error, return type must be double not void
    	return 0;
    }
 
    String thirdMethodOfSuperClass()
    {
        //No Compile time error,
        //return type is compatible with super class method, because
        //String is sub class of Object class
        return new String();
    }
}
