import java.util.*;

public class LeetCode1480 {
  public static int[] solution(int arr[]) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      arr[i] += arr[i - 1];
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    System.out.println(Arrays.toString(solution(arr)));
  }
}
