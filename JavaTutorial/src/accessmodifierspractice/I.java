package accessmodifierspractice;

 class I
{
   
	int i=6;
 
	protected  I()
    {
    	 System.out.println("Constructor");
      //Constructor with default modifier
    }
 
    void methodOfClassI()
    {
        //Method with default access modifier
        System.out.println("methodOfClassF");
        G b = new G();
    }
 
    protected class G
    {

		
      
    	//Inner Class with default access modifier
    }
}