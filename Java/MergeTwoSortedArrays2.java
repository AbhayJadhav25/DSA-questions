import java.util.*;

public class MergeTwoSortedArrays2 {
  public void swap(int nums1[], int nums2[], int idx1, int idx2) {
    if (nums1[idx1] > nums2[idx2]) {
      int temp = nums1[idx1];
      nums1[idx1] = nums2[idx2];
      nums2[idx2] = temp;
    }
  }

  public void mergeTwoSorted(int[] nums1, int m, int nums2[], int n) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;
    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
        nums1[k--] = nums1[i--];
      } else {
        nums1[k--] = nums2[j--];
      }
      while (j >= 0) {
        nums1[k--] = nums2[j--];
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of First and second array : ");
    int m = sc.nextInt();
    int n = sc.nextInt();

    int arr1[] = new int[m + n];
    int arr2[] = new int[n];

    System.out.println("Enter elements in first array : ");
    for (int i = 0; i < m; i++) {
      arr1[i] = sc.nextInt();
    }
    System.out.println("Enter elements in second array : ");
    for (int i = 0; i < n; i++) {
      arr2[i] = sc.nextInt();
    }
    MergeTwoSortedArrays res = new MergeTwoSortedArrays();
    res.mergeTwoSorted(arr1, m, arr2, n);
    for (int i = 0; i < m + n; i++) {
      System.out.print(arr1[i] + " ");
    }
  }
}
