import java.util.Arrays;

class LeetCode1920 {
  public static int[] buildArray(int[] nums) {
    int arr[] = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      arr[i] = nums[nums[i]];
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr[] = { 0, 2, 1, 5, 3, 4 };
    int res[] = buildArray(arr);
    System.out.println(Arrays.toString(res));
  }
}