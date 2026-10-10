package Arrays;

//Rotating an array(left rotation,right rotation)
public class RotatingAnArray
{
    public static void main(String[] args) {
        int A[] = {5, 9, 6, 10, 12, 14, 44, 45, 14, 76};

        int temp = A[0];

        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];
        }
        A[A.length - 1] = temp;

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
            System.out.println(" ");
        }
    }
}