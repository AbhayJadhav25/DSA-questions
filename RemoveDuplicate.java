import java.util.*;

class RemoveDuplicate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int newArr[] = new int[size];
        
        //Sort an array first
        System.out.println("Enter Elements in an array : ");
        for(int i=0;i<size ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            for(int j=0 ; j<size-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];                
                    arr[j+1] = temp;
                }
            }
        }
        
         System.out.println("Arrray before the remove the Duplicate element or Sorted array : ");
         for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();

         //Remove the Duplicate
         int j=0;
         for(int i=0 ; i<size-1 ; i++){
            if(arr[i]!=arr[i+1]){
                newArr[j++] = arr[i];
            }
         }
         newArr[j++] = arr[size-1];
         System.out.println("Array after remove the Duplicate : ");

         for(int i=0 ; i<j ;i++){
            System.out.print(newArr[i]+" ");
         }
         sc.close();
    }
}