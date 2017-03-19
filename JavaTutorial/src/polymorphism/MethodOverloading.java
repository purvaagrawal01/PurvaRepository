package polymorphism;
public class MethodOverloading
{
    private void methodOverloaded()
    {
        //No argument, private method
    }
 
    private int methodOverloaded(int i)
    {
        //One argument private method
        return i;
    }
 
    protected int methodOverloaded(double d)
    {
        //Protected Method
        return 0;
    }
 
    public void methodOverloaded(int i, double d)
    {
        //Public Method
    }
}