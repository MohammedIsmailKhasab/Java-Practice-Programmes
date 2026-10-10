package Arrays;

public class DeletingAnElement
{
    public static void main(String[] args)
    {
        int A[] = new int[10];

        A[0] = 1;
        A[1] = 2;
        A[2] = 35;
        A[3] = 44;
        A[4] = 51;
        A[5] = 62;

        int n=6;

        for(int i=n ;i<n;i++)
            {
            System.out.print(A[i] + " ");
                System.out.println(" ");
            }

        int x=1;
        int index=1;

        for(int i=index ;i<n-1;i++)
        {
            A[i] =A[i+1];
        }
        n--;
        for(int i=0; i < n;i++)
        {
            System.out.println( A[i] + " ");
        }
    }
}