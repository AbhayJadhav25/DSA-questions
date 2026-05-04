public class LeetCode9 {
  public static boolean isPalindrome(int num) {
    if (num < 0)
      return false;

    int x = num;
    double rev = 0;
    while (num > 0) {
      rev = (rev * 10) + (num % 10);
      num /= 10;
    }
    if (rev > Integer.MAX_VALUE)
      return false;
    else
      return x == rev;
  }

  public static void main(String[] args) {
    int num = 1221;
    boolean res = isPalindrome(num);
    System.out.println(res);
  }
}
