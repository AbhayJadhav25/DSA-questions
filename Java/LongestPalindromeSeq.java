import java.util.*;

public class LongestPalindromeSeq {
  static String longestPalindrome(String str) {
    int start = 0, maxlen = 1;
    int size = str.length();

    for (int i = 1; i < size; i++) {
      // Even length palindrome
      int left = i - 1, right = i;
      while (left >= 0 && right < size && str.charAt(left) == str.charAt(right)) {
        if (right - left + 1 > maxlen) {
          maxlen = right - left + 1; 
          start = left;
        }
        left--;
        right++;
      }

    //Odd length palindrome
      left = i - 1;
      right = i + 1;
      while (left >= 0 && right < size && str.charAt(left) == str.charAt(right)) {
        if (right - left + 1 > maxlen) {
          maxlen = right - left + 1; 
          start = left;
        }
        left--;
        right++;
      }
    }
    return str.substring(start, start + maxlen);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any string : ");
    String str = sc.nextLine(); 
    String res = longestPalindrome(str);
    System.out.println("Longest Palindromic Substring: " + res);
    sc.close();
  }
}
