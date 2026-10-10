package inheritance;

import org.constructor.example.CopyConstructor.C;

//parameterised constructor
public class Parent1
{
    Parent1()
    {
        System.out.println("Non-parameterized constructor of parent1");
    }
    Parent1(int a)
    {
        System.out.println(" parameterized constructor of parent1 " + a);
    }
}

class Child  extends Parent1
{
    Child()
    {
        System.out.println("Non-param of child");
    }
    Child(int a)
    {
        System.out.println("param of child");
    }

    Child(int a,int b)
    {
        super(a);
        System.out.println(" 2 param of child "+b);
    }
}

class SuperConst
{
    public static void main(String[] args)
    {
        Child c=new Child(20,30);
    }
}