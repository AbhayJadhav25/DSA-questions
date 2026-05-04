import java.util.*;

class LeetCode2150 {
  static List<Integer> findLonely(int[] nums) {
    int n = nums.length;
    ArrayList<Integer> ans = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < n; i++) {
      if ((i == 0 || nums[i] - nums[i - 1] > 1) && (i == n - 1 || nums[i + 1] - nums[i] > 1)) {
        ans.add(nums[i]);
      }
    }
    return ans;
  }

  static List<Integer> solution2(int nums[]) {
    ArrayList<Integer> ans = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      int val = entry.getKey();
      if (entry.getValue() == 1 && !map.containsKey(val + 1) && !map.containsKey(val - 1)) {
        ans.add(val);
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int nums[] = { 10, 6, 5, 8 };
    ArrayList<Integer> ans = new ArrayList<>(solution2(nums));
    for (int num : ans) {
      System.out.print(num + " ");
    }
  }
}