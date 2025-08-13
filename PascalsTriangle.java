import java.util.Scanner;

class PascalsTriangle {
    public static int[][] generate(int rows) {
        int[][] triangle = new int[rows][];  // jagged array

        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1];    // each row has i+1 elements
            triangle[i][0] = 1;              // first element is always 1
            triangle[i][i] = 1;              // last element is always 1

            // fill middle elements
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        return triangle;
    }

    public static void printTriangle(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] triangle = generate(rows);
        printTriangle(triangle);

        sc.close();
    }
}
