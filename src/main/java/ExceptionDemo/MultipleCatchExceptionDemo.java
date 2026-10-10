package ExceptionDemo;

public class MultipleCatchExceptionDemo
{
    public static void main(String[] args)
    {
        int A[]={30,20,5,0};

        try {
            int c = A[0] / A[2];
            System.out.println("Division is" + c);

            System.out.println(A[4]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Denominator should not be zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index");
        }
        System.out.println("Bye");
    }
}