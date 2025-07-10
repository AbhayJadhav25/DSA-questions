import java.util.*;
class largestInArray{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter any"+size+" element");
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        int max = arr[0];

        for(int i=1 ; i<size ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            
        }
        System.out.println("Largest element in an array is "+max);
        scan.close();
    }
}
