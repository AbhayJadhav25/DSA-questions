import java.util.*;

public class LeaderElement {
    static List<Integer> leaderElements(int arr[]) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();
        int max = arr[n - 1];
        leaders.add(max); 

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders.add(max);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements in an array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> res = leaderElements(arr);
        System.out.print("Leader elements: ");
        for (int val : res) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
