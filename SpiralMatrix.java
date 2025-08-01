import java.util.*;

public class SpiralMatrix {
    static int[] spiralMatrix(int arr[][]) {
        int m = arr.length; //row
        int n = arr[0].length; //column
        int result[] = new int[m * n];
        int index = 0;
        int left = 0, right = n - 1, top = 0, bottom = m - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result[index++] = arr[top][i];
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[index++] = arr[i][right];
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[index++] = arr[bottom][i];
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = arr[i][left];
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int cols = sc.nextInt();

        int arr[][] = new int[row][cols];

        System.out.println("Enter elements in an array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int res[] = spiralMatrix(arr);
        System.out.println("Spiral order: " + Arrays.toString(res));
    }
}