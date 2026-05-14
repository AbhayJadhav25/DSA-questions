import java.util.HashMap;

public class HighestAndLowestFreq_6 {
    static int[] highestAndLowestFreq(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int minFreqKey = -1;
        int maxFreqKey = -1;

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;

        for (int key : freq.keySet()) {
            int currentKeyFreq = freq.get(key);

            if (currentKeyFreq < minFreq) {
                minFreq = currentKeyFreq;
                minFreqKey = key;
            }

            if (currentKeyFreq > maxFreq) {
                maxFreq = currentKeyFreq;
                maxFreqKey = key;
            }
        }
        int ans[] = {minFreqKey , maxFreqKey};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 1, 3, 1, 4, 1, 4, 1, 4, 1 };
        int ans[] = highestAndLowestFreq(arr);

        System.out.println("Value Have Maximum Frequence =  " + ans[1]);
        System.out.println("Value Have Minimum Frequence =  " + ans[0]);
    }
}
