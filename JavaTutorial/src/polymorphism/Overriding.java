package polymorphism;

class SuperClassA
{
    void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}
 
class SubClassA extends SuperClassA
{
    void methodOfSuperClass()
    {
        //SuperClass method is overrided
        //We can keep any tasks here according to our requirements.
        System.out.println("From Sub Class");
    }
}
 
