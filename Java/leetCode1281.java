public class leetCode1281 {
  public static int solution(int num) {
    int sum = 0, prod = 1;
    while (num > 0) {
      sum += (num % 10);
      prod *= (num % 10);
      num /= 10;
    }
    int res = prod - sum;
    return res;
  }

  public static void main(String[] args) {
    int n = 234;
    int res = solution(n);
    System.out.println(res);
  }
}
