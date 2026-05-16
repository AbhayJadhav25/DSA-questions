import java.util.*;

public class ThreeSum11 {
    static List<List<Integer>> threeSum(int arr[]){
        
        List<List<Integer>> op = new ArrayList<>();
        int n = arr.length;

        for(int i = 0 ; i<n-2 ; i++){
            for(int j = i+1 ; j<n-1 ; j++){
                for(int k = j+1 ; k<n ; k++){
                    if(arr[i]+arr[k]+arr[j] == 0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        op.add(temp);
                    }
                }
            }
        }
        return op;
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,4};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }
}
