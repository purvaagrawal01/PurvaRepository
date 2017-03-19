package polymorphism;

public class MethodOverriding
{
    public static void main(String[] args)
    {
        SuperClass superclass = new SuperClass();
        //superclass.methodOfSuperClass();         //Output : From Super Class
        superclass.firstMethodOfSuperClass();
        SubClass subclass = new SubClass();
       // subclass.methodOfSuperClass();          //Output : From Sub Class
        subclass.firstMethodOfSuperClass();
        SuperClass supersubclass = new SubClass();
        supersubclass.firstMethodOfSuperClass();
    }
}	