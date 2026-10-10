package ExceptionDemo;

class minbalance
{
    int minbalance=5000;
}

class minbalanceexception extends Exception
{
        public String toString()
        {
            return "minimum balance should be 5000,try again with smaller amount";
        }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        minbalance bal = new minbalance();
        bal.minbalance = 500;

        try {
            if (bal.minbalance < 5000)
            {
                throw new minbalanceexception();
            }
            System.out.println("Transaction Successful");
        }
        catch (minbalanceexception e)
        {
            System.out.println(e);
        }
    }
}