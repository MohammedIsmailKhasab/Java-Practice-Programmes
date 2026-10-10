package SimplePrograms;

public class MethodOverloadingDemo {

    static void foo(){
        System.out.println("Good evening bro");
    }

    static void foo(int a, int b){
        System.out.println("Good evening " + a +  " bro");
        System.out.println("Good evening " + b +  " bro");
    }

    public static void main(String[] args) {
        foo();
        foo(10,20);

    }
}
