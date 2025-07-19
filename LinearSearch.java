import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        boolean isFound = false;

        System.out.println("Enter "+size+" elements in an array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value to search");
        int val = sc.nextInt();
        int pos=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==val){
                isFound = true;
                pos = i+1;
                break;
            }
        }
        if(isFound){
            System.out.println("Value is present at "+pos+" position");
        }else{
            System.out.println("Value is not present in an array");
        }
        sc.close();
    }
}
