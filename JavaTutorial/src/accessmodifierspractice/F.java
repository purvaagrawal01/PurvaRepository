package accessmodifierspractice;

public class F
{
   
	int i=6;
 
   protected F()
    {
    	 System.out.println("Constructor");
      //Constructor with default modifier
    }
 
    void methodOfClassF()
    {
        //Method with default access modifier
        System.out.println("methodOfClassF");
        G b = new G();
    }
 
    public class G
    {
// why we have to create G()?
		protected G(){
			 System.out.println("public constructor of protected class");
		}
      
    	//Inner Class with default access modifier
    }
}