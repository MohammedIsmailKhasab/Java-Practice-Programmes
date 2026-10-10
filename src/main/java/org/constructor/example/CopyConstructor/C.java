package org.constructor.example.CopyConstructor;

//CopyConstructor
public class C {
    int a;
    String b;
    C()
    {
        a=10; b="LearnCoding";
        System.out.println(a+" "+b);
    }

    C(C ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}
class D
{
    public static void main(String[] args) {
        C r = new C();
        C r2=new C(r);
    }
}
