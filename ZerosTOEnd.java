import java.util.*;
public class ZerosTOEnd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size+" elements in an array : ");
        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i<size ; i++){
            if(arr[i]==0){
                int temp= arr[i];
                for(int j=i+1 ; j<size ; j++){
                    arr[j-1] = arr[j];
                }
                arr[size-1]=temp;
            }
        }
        System.out.println("Array after moving zeros to end : ");
        for(int i=0 ; i<size ; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
