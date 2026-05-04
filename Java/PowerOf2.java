class PowerOf2 {
  public static boolean isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
  }

  public static void main(String[] args) {
    int num = 4;
    boolean ans = isPowerOfTwo(num);
    System.out.println(ans);
  }
}