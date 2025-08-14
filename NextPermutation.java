import java.util.*;

public class NextPermutation {
    static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr) {
        int pivot = -1;
        int n = arr.size();

        // Step 1: Find the pivot
        for (int i = n - 2; i >= 0; i--) { // ✅ avoid out of bounds
            if (arr.get(i) < arr.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse the whole array
        if (pivot == -1) {
            Collections.reverse(arr);
            return arr;
        }

        // Step 3: Find next larger element than pivot from the right
        for (int i = n - 1; i > pivot; i--) {
            if (arr.get(i) > arr.get(pivot)) {
                // swap pivot and i
                int temp = arr.get(i);
                arr.set(i, arr.get(pivot));
                arr.set(pivot, temp);
                break;
            }
        }

        // Step 4: Reverse suffix
        Collections.reverse(arr.subList(pivot + 1, n));

        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array : ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            int ele = sc.nextInt();
            arr.add(ele);
        }

        ArrayList<Integer> res = nextPermutation(arr);
        System.out.println(res);
    }
}
