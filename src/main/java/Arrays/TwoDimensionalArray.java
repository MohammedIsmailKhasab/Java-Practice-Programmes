package Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int A[][] = new int[5][5];

        int B[][] = {{1, 2, 3}, {4, 5, 6}, {6, 3, 2}};

        for (int i = 0; i < B.length; i++)
        {
            for (int j = 0; j < B[0].length; j++)
            {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }
}
