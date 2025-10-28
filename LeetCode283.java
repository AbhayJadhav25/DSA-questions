import java.util.*;

public class LeetCode283 {
  public static void solution(int nums[]) {
    int n = nums.length;
    int pos = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] != 0) {
        nums[pos++] = nums[i];
      }
    }
    while (pos < n) {
      nums[pos++] = 0;
    }
    System.out.println(Arrays.toString(nums));
  }

  public static void main(String[] args) {
    int arr[] = { 0, 1, 0, 3, 12 };
    solution(arr);
  }
}
