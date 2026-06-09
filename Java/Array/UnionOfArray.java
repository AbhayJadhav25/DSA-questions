import java.util.ArrayList;
import java.util.HashSet;
public class UnionOfArray {

    static void unionOfArray(int arr1[] , int arr2[]){
        HashSet<Integer> set = new HashSet<>();
       

        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            if(!(set.contains(num))){
                set.add(num);
            }
        }
         ArrayList<Integer> arr = new ArrayList<>(set);
        System.out.println(set);
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,4,2,1,5};
        int arr2[] = {1,3,6,5,2,4,7};
        unionOfArray(arr1,arr2);
    }
}
