public class LeetCode1672 {
  public static int solution(int accounts[][]) {
    int n = accounts.length;
    int m = accounts[0].length;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = 0; j < m; j++) {
        sum += accounts[i][j];
      }
      if (sum > max)
        max = sum;
    }
    return max;
  }

  public static void main(String[] args) {
    int accounts[][] = {
        { 1, 2 }, { 7, 3 }, { 2, 5 }
    };
    System.out.println(solution(accounts));
  }
}
