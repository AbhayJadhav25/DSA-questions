import java.util.*;
public class FirstRepeatElement_13 {
    static int solution(int arr[]){
        int n = arr.length;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int nums : arr){
            map.put(nums , map.getOrDefault(nums , 0)+1);
        }

        for(int i : arr){
            if(map.get(i)>1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,5,3,4,3,5,6};
        int ans = solution(arr);
        System.out.println("First Repeating Element = "+ans);
    }
}
