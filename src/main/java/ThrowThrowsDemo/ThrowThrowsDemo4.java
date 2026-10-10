package ThrowThrowsDemo;

public class ThrowThrowsDemo4
{
    static void divide(int a, int b) throws ArithmeticException
    {
        if (b == 0) {
            throw new ArithmeticException("Cannot Divide by zero");
        }

            System.out.println(a / b);

        }

            public static void main (String[] args) throws ArithmeticException
            {
                divide(10, 2);
            }
        }