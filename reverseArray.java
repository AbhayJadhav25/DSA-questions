import java.util.*;
class reverseArray{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];

        for(int i = 0 ; i<size ; i++){
            arr[i] = scan.nextInt();
        }

        /*method 1
        for(int i=size-1 ; i>=0 ; i--){
            System.out.print(arr[i]+" ");
        }
         
         method 2

        for(int i =0 ; i<size/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i] = temp;
        }

        for(int i =0 ; i<size ; i++){
            System.out.print(arr[i]+" ");
        }*/

       int reverse[] = new int[size];
       for(int i = 0 ; i<size ; i++){
        reverse[i] = arr[size-1-i];
       }

       for(int i=0 ; i<size ; i++){
        System.out.print(reverse[i]+" ");
       }
       
    scan.close();
    }
}
