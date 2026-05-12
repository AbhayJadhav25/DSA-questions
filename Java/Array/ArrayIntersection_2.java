import java.util.ArrayList;
import java.util.HashSet;

public class ArrayIntersection_2 {
    public static int[] arrayIntersection(int arr1[] , int arr2[]){
        int arr[] = new int[arr1.length];
        int k=0;
        //brute force
        for(int i=0 ; i<arr1.length ; i++){
            for(int j=0 ; j<arr2.length ; j++){
                if(arr1[i] == arr2[j]){
                    arr[k++] = arr1[i];
                    break;
                }
            }
        }
        return arr;
    }

    public static ArrayList<Integer> intersection(int arr1[] , int arr2[]){

        HashSet<Integer> set= new HashSet<Integer>();
        ArrayList<Integer> arr= new ArrayList<Integer>();

        for(int n : arr2){
            set.add(n);
        }

        for(int i : arr1){
            if(set.contains(i)){
                arr.add(i);
                set.remove(i); //To avoid duplicate
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr1[] = {2 , 3 , 5 , 1 , 9};
        int arr2[] = {6 , 4 , 2 ,1 , 5};

        System.out.println(intersection(arr1, arr2));
    }
}
