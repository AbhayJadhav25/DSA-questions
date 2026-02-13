import java.util.HashSet;

public class FindDuplicate {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 2, 1, 5, 6 };

    HashSet<Integer> seen = new HashSet<>();
    HashSet<Integer> duplicate = new HashSet<>();

    for (int num : arr) {
      if (!seen.add(num)) {
        duplicate.add(num);
      }
    }
    System.out.println("Dplicate Numbers : " + duplicate);
    System.out.println("Unique String is : " + seen);
  }
}
