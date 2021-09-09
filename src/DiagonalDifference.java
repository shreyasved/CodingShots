import java.util.Arrays;

/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
7 8 9
The left-to-right diagonal = 1 + 5 + 9 = 15. The right to left diagonal = 3 + 5 + 9 = 17. Their absolute difference is |15 - 17| = 2.
*/
public class DiagonalDifference {

    public void findDiagonalDifference(int[][] arr){
        int diagonal1 = 0, diagonal2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    diagonal1 += arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    diagonal2 += arr[i][j];
                }
            }
        }
        System.out.println(Math.abs(diagonal1-diagonal2));
    }

    public void findDiagonalDifferenceSingleLoop(int[][] arr){
        int diagonal1 = 0, diagonal2 = 0;

        for (int i = 0; i < arr.length; i++) {
            diagonal1 += arr[i][i];
            diagonal2 += arr[i][arr.length-1-i];
        }
        System.out.println(Math.abs(diagonal1-diagonal2));
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {9,8,9}};
        DiagonalDifference dd = new DiagonalDifference();
        dd.findDiagonalDifference(arr);
        dd.findDiagonalDifferenceSingleLoop(arr);
    }
}
