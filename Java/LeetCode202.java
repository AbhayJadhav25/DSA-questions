//Happy Number
public class LeetCode202 {
  public static boolean isHappy(int num) {
    int sum = num;
    while (sum > 9) {
      sum = 0;
      while (num > 0) {
        sum += ((num % 10) * (num % 10));
        num /= 10;
      }
      num = sum;
    }
    if (sum == 1 || sum == /)
      return true;
    else
      return false;
  }

  public static void main(String[] args) {
    int num = 6;
    boolean res = isHappy(num);
    System.out.println(res);
  }
}
