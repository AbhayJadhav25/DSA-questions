//Reverse number
public class ReverseNumber {
  public static int reverse(int num) {
    double rev = 0;
    while (num > 0) {
      rev = (rev * 10) + (num % 10);
      num /= 10;
    }
    if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
      return 0;
    else
      return (int) rev;
  }

  public static void main(String[] args) {
    int num = 123;
    System.out.println(reverse(num));
  }
}
