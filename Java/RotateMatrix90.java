import java.util.*;

public class RotateMatrix90 {
  static int[][] rotateMatrix(int matrix[][]) {
    int n = matrix.length;
    for (int i = 0; i < (n + 1) / 2; i++) {
      for (int j = 0; j < n / 2; j++) {
        int temp = matrix[n - 1 - j][i];
        matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
        matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];
        matrix[j][n - 1 - i] = matrix[i][j];
        matrix[i][j] = temp;
      }
    }
    return matrix;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of an array : ");
    int size = sc.nextInt();

    int arr[][] = new int[size][size];

    System.out.println("Enter " + size * size + " elements in an array : ");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++)
        arr[i][j] = sc.nextInt();
    }

    int[][] res = rotateMatrix(arr);
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(res[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
