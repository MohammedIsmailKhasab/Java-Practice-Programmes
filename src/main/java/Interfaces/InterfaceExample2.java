package Interfaces;

interface Test
{
    void meth1();
    void meth2();
}

class Test2 implements Test
{
    @Override
    public void  meth1()
    {
        System.out.println("meth1 of class Test2");
    }

    @Override
    public void meth2()
    {
        System.out.println("meth2 of class Test2");
    }

    public void  meth3()
    {
        System.out.println("meth3 of class Test2");
    }
}

public class InterfaceExample2 {
    public static void main(String[] args)
    {
        Test t = new Test2();
        t.meth1();
        t.meth2();
    }
}