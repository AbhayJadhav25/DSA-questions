public class CountOddNumber {
  public static int countOdd(int low, int high) {
    int count = (high - low) / 2;
    if (low % 2 != 0 || high % 2 != 0) {
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    int low = 3;
    int high = 7;
    int count = countOdd(low, high);
    System.out.println(count);
  }
}
