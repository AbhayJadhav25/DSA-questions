import java.util.*;

public class MergeTwoSortedArrays {
  public void swap(int nums1[], int nums2[], int idx1, int idx2) {
    if (nums1[idx1] > nums2[idx2]) {
      int temp = nums1[idx1];
      nums1[idx1] = nums2[idx2];
      nums2[idx2] = temp;
    }
  }

  public void mergeTwoSorted(int[] nums1, int m, int nums2[], int n) {
    int len = m + n;
    int gap = (len / 2) + (len % 2);
    while (gap > 0) {
      int left = 0;
      int right = left + gap;
      while (right < len) {
        if (left < m && right >= m) {
          swap(nums1, nums2, left, right - m);
        } else if (left >= m) {
          swap(nums2, nums2, left - m, right - m);
        } else {
          swap(nums1, nums1, left, right);
        }
        left++;
        right++;
      }
      if (gap == 1)
        break;
      gap = (gap / 2) + (gap % 2);
    }
    for (int i = 0; i < n; i++) {
      nums1[m + i] = nums2[i];
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
