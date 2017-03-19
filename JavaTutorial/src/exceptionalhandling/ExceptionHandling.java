package exceptionalhandling;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
        
       /* String s = "0";
        System.out.println(s.length());  //This statement throws NullPointerException
        System.out.println(s); */
        
        /*Object o = new Object();
          ExceptionHandling e = (ExceptionHandling) o; */ 
        
       /* int num[] = {1, 2, 3, 4};
        System.out.println(num[5]);
        int a[]=new int[5];  
        a[10]=50;*/
        
       /* String s="abc";  
        int i=Integer.parseInt(s);
        System.out.println("exception thrown1");
        Integer I = new Integer("abc");
        System.out.println("exception thrown2");
        System.out.println("i="+i);
        System.out.println("I="+I);*/
        
       /* try
        {
            
        	
        }
        
     catch (Exception e)
        {
            System.out.println("exception caught");
        }*/
    //This statement throws NumberFormatException
 
        //System.out.println("This statement will also execute");
        
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
        
        for (int i = 0; i < 6; i++)
        {
            try
            {
                int a = s[i].length() + Integer.parseInt(s[i]);       
 
                //This statement may throw NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException
 
            }
 
            catch(NumberFormatException ex)
            {
            	System.out.println(ex);
                System.out.println("NumberFormatException will be caught here");
               ex.printStackTrace();
            }
 
            catch (ArrayIndexOutOfBoundsException ex)
            {  System.out.println("ArrayIndexOutOfBoundsException will be caught here");
            	System.out.println(ex);
                ex.printStackTrace();
              
            }
 
            catch (NullPointerException ex)
            {
                System.out.println("NullPointerException will be caught here");
            }
        finally
        {
            System.out.println("This block is always executed");
        }
        
        
    }
    
    }
}
