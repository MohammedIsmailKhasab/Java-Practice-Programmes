package inheritance;

import org.constructor.example.CopyConstructor.C;

public class Parent
{
    public Parent()
    {
        System.out.println("Parent constructor");
    }

    static class Child extends Parent
    {
        public Child()
        {
            System.out.println("Child constructor");
        }
    }

     static class GrandChild extends Child {
        public GrandChild() {
            System.out.println("GrandChild constructor");
        }
    }
        public static void main(String[] args)
        {
            GrandChild c = new GrandChild();
        }
    }