//Factorial trailing zero
public class LeetCode172 {
  /*
   * public static int factorial(int num) {
   * int fact = 1;
   * for (int i = 1; i <= num; i++) {
   * fact *= i;
   * }
   * return fact;
   * }
   * 
   * public static int trailZero(int num) {
   * int fact = factorial(num);
   * int count = 0;
   * while (fact % 10 == 0) {
   * count++;
   * fact /= 10;
   * }
   * return count;
   * }
   */

  public static int trailZero(int num) {
    if (num < 0)
      return -1;
      
    int count = 0;
    while (num / 5 > 0) {
      count += (num / 5);
      num /= 5;
    }
    return count;
  }

  public static void main(String[] args) {
    int num = 150;
    int res = trailZero(num);
    System.out.println(res);
  }
}
