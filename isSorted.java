import java.util.*;
class isSorted{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        boolean isAscending = true;
        boolean isDescending = true;
        System.out.println("Enter Elements of an array: ");
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }

        //only to check array is in ascending order or not.
       /* for(int i =1 ; i<size  ; i++){
            if(arr[i]<arr[i-1]){
                isAscending = false;
                break;
            }
        }*/ 

       for(int i=1 ; i< size ; i++){
        if(arr[i]<arr[i-1]){
            isAscending = false;
        }
        if(arr[i]>arr[i-1]){
            isDescending = false;
        }
         
       }
        
        if(isAscending){
            System.out.println("Array is sorted in Ascending order");
        }else if(isDescending){
            System.out.println("Array is sorted in descending order");
        }else{
            System.out.println("Array is not sorted in any order");
        }

    }
}