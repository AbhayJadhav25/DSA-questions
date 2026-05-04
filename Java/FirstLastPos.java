import java.util.*;

public class FirstLastPos {
    static void firstLastPos(int arr[], int val) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        if (first == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First occurrence : " + (first+1));
            System.out.println("Last occurrence : " + (last+1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements in an array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value to search : ");
        int val = sc.nextInt();

        firstLastPos(arr, val);
        sc.close();
    }
}