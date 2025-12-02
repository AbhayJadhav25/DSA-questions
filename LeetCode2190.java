import java.util.HashMap;
import java.util.Map;

public class LeetCode2190 {
  public static int mostFrequent(int[] nums, int key) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == key) {
        map.put(nums[i + 1], map.getOrDefault(nums[i + 1], 0) + 1);
      }
    }
    int max = Integer.MIN_VALUE, ans = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > max) {
        max = entry.getValue();
        ans = entry.getKey();
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 100, 200, 1, 100, 1, 200, 1, 200, 1, 200 };
    int ans = mostFrequent(nums, 1);
    System.out.println(ans);
  }
}
