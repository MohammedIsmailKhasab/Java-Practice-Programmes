package lambdaexpressiondemo;

class UseLambda
{
    public void callLambda(MyLambda ml)
    {
        ml.display();
    }
}

class DemoLambda
{
    public void method()
    {
        UseLambda lambda = new UseLambda();
        lambda.callLambda(() -> {
            System.out.println("Hello World");
        });
    }
}
public class LambdaDemo2
{
    static void main(String[] args)
    {
        DemoLambda lambda = new DemoLambda();
        lambda.method();
    }
}