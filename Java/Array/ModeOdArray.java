import java.util.*;
public class ModeOdArray {
    static int modeOfArray(int arr[]){
        int mode;
        HashMap<Integer , Integer> freq =new  HashMap<>();
        
        for(int num : arr){
            freq.put(num , freq.getOrDefault(num , 0) +1);
        }
        System.out.println(freq);

        int maxFreq = -1;
        int maxFreqKey = -1;

        for(int key : freq.keySet()){
            int currentKey = key;
            int currentKeyFreq = freq.get(currentKey);

            if(currentKeyFreq > maxFreq){
                maxFreqKey = currentKey;
                maxFreq = currentKeyFreq;
            }
        }
        return maxFreqKey;
    }
    public static void main(String[] args) {
        int arr[] = {5,2,3,2,3,1,2,9};
    
        int ans =  modeOfArray(arr);
        System.out.println("Mode of Array = "+ans);
    }
}
