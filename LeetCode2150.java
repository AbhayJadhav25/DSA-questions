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

  public static void main(String[] args) {
    int nums[] = { 10, 6, 5, 8 };
    ArrayList<Integer> ans = new ArrayList<>(findLonely(nums));
    for (int num : ans) {
      System.out.print(num + " ");
    }
  }
}