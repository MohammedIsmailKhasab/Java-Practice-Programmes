package Polymorphism;

class Super
{
    void display()
    {
        System.out.println("Super display");
    }
}

class Sub extends Super
{
    @Override
    void display()
    {
        System.out.println("Sub display");
    }
}

public class PolymorphismUsingMethodOverriding
{
    public static void main(String[] args)
    {
        Super sub=new Sub();
        sub.display();
    }
}