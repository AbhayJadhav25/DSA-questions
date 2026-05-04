import java.util.*;
public class TransposeMatrix {
    static int[][] transposeMatrix(int [][] arr){
        int rows = arr.length; //row
        int cols = arr[0].length; //column 
        int transpose[][] = new int[cols][rows];
        for(int i = 0 ; i< rows ; i++){
            for(int j=0 ; j< cols ; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of collumns : ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        System.out.println("Enter "+(rows*cols)+" elements in an array : ");
        for(int i=0;i<rows;i++){
            for(int j=0 ; j<cols ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int res[][] = transposeMatrix(arr);
        for(int i=0 ; i<res.length ; i++){
            for(int j=0 ; j<res[0].length ; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
