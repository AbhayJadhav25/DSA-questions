import java.util.*;

class FLOccurrence {
    static int firstOccurrence(int arr[], int val) {
        int low = 0, high = arr.length - 1, index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == val) {
                index = mid;
                high = mid - 1;
            } else if (arr[mid] < val) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    static int lastOccurrence(int arr[], int val) {
        int low = 0, high = arr.length - 1, index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == val) {
                index = mid;
                low = mid + 1;
            } else if (arr[mid] < val) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size + " in an sorted oredr : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value to search : ");
        int val = sc.nextInt();

        int first = firstOccurrence(arr, val);
        int last = lastOccurrence(arr, val);
        System.out.println("First Occurrence : " + (first + 1));
        System.out.println("Last Occurrence : " + (last + 1));

        sc.close();
    }
}
