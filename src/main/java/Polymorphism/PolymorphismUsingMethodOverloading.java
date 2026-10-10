package Polymorphism;

class Test
{
    public int max(int a, int b)
    {
//        return a>b?a:b;
        if(a>b)
            return a;
        else
            return b;
    }

    public  int max(int a, int b, int c)
    {
        if(a>b&&a>c)
        {
            return a;
        }
        else if(b>c)
        {
            return b;
        }
        return c;
    }
}

public class PolymorphismUsingMethodOverloading
{
    public static void main(String[] args)
    {
        Test t=new Test();
        System.out.println(t.max(23,43));
        System.out.println(t.max(23,43,53));
    }
}