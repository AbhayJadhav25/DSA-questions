import java.util.*;
public class RowColumnWiseSearch {
    static boolean search(int matrix[][] , int target){
        int row = matrix.length;
        int cols = matrix[0].length;

        int start = 0 ;
        int end = row*cols-1;

        while(start <= end){
            int mid = start+(end - start)/2;
            int midVal = matrix[mid/cols][mid%cols];
            if(midVal==target){
                return true;
            }else if(midVal < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }

   /*This logic time complexity is O(log(m+n))
   static boolean searchCol(int arr[][] , int val , int row){
        int cols = arr[0].length;
        int start = 0 , end = cols-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(val==arr[row][mid]){
                return true;
            }else if(val > arr[row][mid]){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }

    static boolean search(int arr[][] , int val){
        int row = arr.length;
        int cols = arr[0].length;
        int startRow = 0  , endRow = row-1;
        while(startRow <=endRow){
            int midRow = startRow+(endRow - startRow) /2;
            if(val >= arr[midRow][0] && val<=arr[midRow][cols-1]){
                //apply binary search on these row again
                 return searchCol(arr , val ,midRow);
            }else if(val > arr[midRow][cols-1]){
                startRow = midRow+1;
            }else{
                endRow = midRow-1;
            }
        }
        return false; 
    }*/
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row : ");
        int row = sc.nextInt();
        System.out.println("Enter size of column : ");
        int cols = sc.nextInt();
         
        int arr[][] = new int[row][cols];
        System.out.println("Enter elements in an array : ");
        for(int i=0;i<row;i++){
            for(int j=0 ; j<cols ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter value to search : ");
        int val = sc.nextInt();;

        boolean res = search(arr, val);
        System.out.println(res);

        sc.close();
    }
}

