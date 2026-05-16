import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {

    static int[] twoSum(int arr[] , int target){
        HashMap<Integer , Integer> map= new HashMap<>();
        int ans[] = new int[2];

        for(int i = 0 ; i<arr.length ; i++){
            int value = arr[i];
            int secondValue = target - value;

            if(map.containsKey(secondValue)){
                ans[0] = i;
                ans[1] = map.get(secondValue);
                return ans;
            }else{
                map.put(value , i);
            }
        }
       
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};

        int ans [] = twoSum(arr,9);

        System.out.println(Arrays.toString(ans));
    }
}
