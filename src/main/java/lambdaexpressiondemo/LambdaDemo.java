package lambdaexpressiondemo;

@FunctionalInterface
interface MyLambda
{
    void display();
}

public class LambdaDemo
{
    static void main(String[] args) {
        MyLambda my = () -> {System.out.println("Hello World");};
        my.display();
    }
}