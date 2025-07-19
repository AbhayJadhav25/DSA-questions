import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter "+size+" elements in sorted order : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for(int i = 0 ; i<arr.length-1 ; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(!isSorted){
            System.out.println("Array is not sorted.Binary search can't applied");
        }else{
            System.out.println("Enter value to search : ");
            int val = sc.nextInt();
            int low=0 , high = arr.length - 1;
            boolean found = false;
            int pos=0;
            while(low<=high){
                int mid = (low+high)/2;
                if(arr[mid]==val){
                    found = true;
                    pos = mid+1;
                    break;
                }

                if(arr[mid]<val){
                    low = mid+1;
                }else{
                    high = mid -1;
                }
            }
            if(found){
                System.out.println("Value is present at "+pos+" position");
            }else{
                System.out.println("Value is not present in an array");
            }
        }
        sc.close();
    }
}
