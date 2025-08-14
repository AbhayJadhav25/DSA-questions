import java.util.*;

public class NextPermutation {
    static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr) {
        int pivot = -1;
        int n = arr.size();


        for (int i = n - 2; i >= 0; i--) { 
            if (arr.get(i) < arr.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            Collections.reverse(arr);
            return arr;
        }

        for (int i = n - 1; i > pivot; i--) {
            if (arr.get(i) > arr.get(pivot)) {
                int temp = arr.get(i);
                arr.set(i, arr.get(pivot));
                arr.set(pivot, temp);
                break;
            }
        }

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
