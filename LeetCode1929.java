import java.util.Arrays;

public class LeetCode1929 {
  public static int[] concatention(int nums[]) {
    int n = nums.length;
    int arr[] = new int[2 * n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = nums[i % n];
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 1 };
    int res[] = concatention(arr);
    System.out.println(Arrays.toString(res));
  }
}
