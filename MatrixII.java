import java.util.Scanner;

public class MatrixII {
    public int[][] matrixII(int n) {
        int matrix[][] = new int[n][n];
        int left =0 , top= 0 , right = n-1 ,bottom=n-1 , val=1;

        while(left<=right && top<=bottom) {
            for(int i=left ; i<=right;i++){
                matrix[top][i] = val;
                val++;
            }
            top++;
            for(int i=top ; i<=bottom;i++){
                matrix[i][right] = val;
                val++;
            }
            right--;
            if(top<=bottom){
                for(int i=right ; i>=left ; i--){
                matrix[bottom][i] = val;
                val++;
            }
            bottom--;
            }
            if(left<=right){
                for(int i=bottom ; i>=top ; i--){
                matrix[i][left]=val;
                val++;
            }
            left++;
            }
        }
        return matrix; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row and column : ");
        int size = sc.nextInt();
        MatrixII res = new MatrixII();
        int matrix[][] = res.matrixII(size);

        System.out.println("Matrix after setting zeroes:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
