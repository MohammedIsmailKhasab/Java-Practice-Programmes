package Arrays;

public class InsertingAnElement
{
    public static void main(String[] args)
    {
        int A[] = new int[10];
        A[0] = 1;
        A[1] = 22;
        A[2] = 31;
        A[3] = 41;
        A[4] = 54;
        A[5] = 65;

        int n=6;

        for(int i=0 ;i<n ; i++)
        {
            System.out.println(A[i]+" ");
            System.out.println(" ");
        }

        int x=20;
        int index=2;

        for(int i=n ;i>index ; i--)
        {
            A[i]=A[i-1];
        }
        A[index]=x;

        for(int i=0 ;i<n ; i++)
        {
            System.out.println(A[i]+" ");
            System.out.println(" ");
        }
    }
}