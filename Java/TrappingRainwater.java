public class TrappingRainwater {
  public static int rainwater(int arr[]) {
    int totalWater = 0;
    int n = arr.length;

    int[] leftMax = new int[n];
    leftMax[0] = arr[0];
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
    }

    int rightMax[] = new int[n];
    rightMax[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
    }

    for (int i = 0; i < n; i++) {
      int waterLevel = Math.min(leftMax[i], rightMax[i]);
      totalWater += waterLevel - arr[i];
    }
    return totalWater;
  }

  public static int rainwater2(int arr[]) {
    int totalWater = 0;
    int n = arr.length;
    int left = 0, right = n - 1;
    int leftMax = 0, rightMax = 0;
    while (left < right) {
      leftMax = Math.max(leftMax, arr[left]);
      rightMax = Math.max(rightMax, arr[right]);

      if (leftMax < rightMax) {
        totalWater += leftMax - arr[left];
        left++;
      } else {
        totalWater += rightMax - arr[right];
        right--;
      }
    }
    return totalWater;
  }

  public static void main(String[] args) {
    int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
    int totalWater = rainwater2(arr);
    System.out.println("Total trapping water is : " + totalWater);
  }
}
