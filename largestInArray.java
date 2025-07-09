import java.util.*;
class largestInArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter any"+size+" element");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        for(int i=1 ; i<size ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            
        }
        System.out.println("Largest element in an array is "+max);
        sc.close();
    }
}