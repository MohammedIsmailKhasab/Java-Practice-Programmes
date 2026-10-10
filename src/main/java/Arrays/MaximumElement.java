package Arrays;

//Finding Maximum Element
public class MaximumElement
{
    public static void main(String[] args)
    {

        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int max = A[0];
        {
            for(int i=0;i<A.length;i++)
            {
                if(A [i] >max)
                {
                    max=A[i];
                }
            }
            System.out.println("Maximum value is :" +max);
        }
    }
}
