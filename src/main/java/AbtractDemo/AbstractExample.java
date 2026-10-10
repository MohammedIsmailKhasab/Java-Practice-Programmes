package AbtractDemo;

abstract class Super
{
    public Super()
    {
        System.out.println("Super Constructor");
    }

    public void display1()
    {
        System.out.println("Super Display1");
    }

     abstract public void display2();
}

class Sub extends Super
{
    @Override
    public void display2()
    {
        System.out.println("Display2 Sub");
    }
}

public class AbstractExample
{
    public static void main(String[] args)
    {
        Sub sup = new Sub();
        sup.display1();
        sup.display2();
    }
}