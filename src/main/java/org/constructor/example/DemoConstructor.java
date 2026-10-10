package org.constructor.example;

//DefaultConstructor
public class DemoConstructor {
    int a; String name;
    DemoConstructor(){
        a=0;
        name="null";
    }

    void show(){
    System.out.println(a+" "+name);
    }
}

class DemoConstructor2{
    public static void main(String[] args) {
        DemoConstructor ref = new DemoConstructor();
        ref.show();
    }
}
