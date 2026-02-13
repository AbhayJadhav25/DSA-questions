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

  public static void findLargest(int arr[]) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("Largest Value : " + max);
  }

  public static void reverseArray(int arr[]) {
    int left = 0, right = arr.length - 1;
    System.out.println("Reverse Array : ");
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 2, 1, 5, 6 };
    FindDuplicate(arr);
    findLargest(arr);
    reverseArray(arr)
  }
}
