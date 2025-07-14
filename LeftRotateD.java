import java.util.*;
public class LeftRotateD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size+" elements in an array : ");
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("How many times you want to rotate the array : ");
        int d = sc.nextInt();

        for(int i=0 ; i<d ; i++){
            int temp = arr[0];

            for(int j=0 ; j<size -1 ; j++){
                arr[j] = arr[j+1];
            }
            arr[size-1] = temp;
        }

        System.out.println("Array after rotate by"+d);
        for(int i=0 ; i<size ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
