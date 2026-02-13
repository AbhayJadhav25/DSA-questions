import java.util.HashSet;

public class Array {

  public static void FindDuplicate(int arr[]) {

    // HashSet<Integer> seen = new HashSet<>();
    // HashSet<Integer> duplicate = new HashSet<>();

    // for (int num : arr) {
    // if (!seen.add(num)) {
    // duplicate.add(num);
    // }
    // }
    // System.out.println("Dplicate Numbers : " + duplicate);
    // System.out.println("Unique String is : " + seen);

    for (int i = 0; i < arr.length; i++) {
      int index = arr[i] - 1;

      if (arr[index] < 0) {
        System.out.println("Duplicate Value : " + arr[i]);
      } else {
        arr[index] = -arr[index];
      }
    }
  }

  // Find Largest number frome the array.
  public static void findLargest(int arr[]) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("Largest Value : " + max);
  }

  // Reverse the array.
  public static void reverseArray(int arr[]) {
    int left = 0, right = arr.length - 1;
    System.out.println("Reverse Array : ");
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  // Check array is sorted or not.
  public static void checkSort(int arr[]) { // 23, 34, 45, 56, 67
    boolean isSort = true;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        isSort = false;
      }
    }
    if (isSort) {
      System.out.println("Array is sorted.");
    } else {
      System.out.println("Array is not sorted");
    }
  }

  // Reverse the string.
  public static void reverseString(String str) {
    char ch[] = str.toCharArray();

    int left = 0, right = str.length() - 1;

    while (left < right) {
      char temp = ch[left];
      ch[left] = ch[right];
      ch[right] = temp;

      left++;
      right--;
    }

    System.out.println(new String(ch));
  }

  // Check Strinng is palindrome or not.
  public static void palindromString(String str) {
    boolean isPalindrome = true;
    int left = 0, right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        isPalindrome = false;
        break;
      }
      left++;
      right--;
    }
    if (isPalindrome) {
      System.out.println("String is Palindrome");
    } else {
      System.out.println("String is not Palindrome.");
    }
  }

  // Count Frequency of Character.
  public static void countFrequency(String str) {
    int freq[] = new int[256]; // ASCII Range 0 to 256.

    for (int i = 0; i < str.length(); i++) {
      freq[str.charAt(i)]++;
    }

    for (int i = 0; i < 256; i++) {
      if (freq[i] > 0) {
        System.out.println((char) i + " occurs " + freq[i]);
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 2, 1, 5, 6 };
    FindDuplicate(arr);
    findLargest(arr);

    int arr2[] = { 21, 56, 43, 12, 34, 98, 87 };
    reverseArray(arr2);
    System.out.println();
    int arr3[] = { 23, 34, 45, 56, 67 };
    checkSort(arr3);
    checkSort(arr2);

    int arr4[] = { 21, 22, 23, 34, 45, 56 };
    checkSort(arr4);

    String str = "Abhay jadhav";
    reverseString(str);

    String str2 = "madam";
    palindromString(str2);
    palindromString(str);

    String str3 = "AAABBCDD";
    countFrequency(str3);

  }
}
