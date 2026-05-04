import java.util.*;

public class Sum3 {
  public static List<List<Integer>> threeSum(int nums[]) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if (nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> triplet = new ArrayList<Integer>();
            triplet.add(nums[i]);
            triplet.add(nums[j]);
            triplet.add(nums[k]);
            Collections.sort(triplet);
            result.add(triplet);
          }
        }
      }
    }
    result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
    return result;
  }

  public static List<List<Integer>> optimalSol(int nums[]) {
    Arrays.sort(nums);
    int n = nums.length;
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (i > 0 && nums[i] == nums[i - 1])
        continue;
      int j = i + 1, k = n - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum < 0) {
          j++;
        } else if (sum > 0) {
          k--;
        } else {
          res.add(Arrays.asList(nums[i], nums[j], nums[k]));
          j++;
          k--;

          while (j < k && nums[j] == nums[j - 1])
            j++;
          while (j < k && nums[k] == nums[k + 1])
            k--;
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[] = { -1, 0, 1, 2, -1, 4 };
    List<List<Integer>> triplets = optimalSol(arr);
    System.out.println("Triplets that sum to 0 : ");
    for (List<Integer> triplet : triplets) {
      System.out.println(triplet);
    }
  }
}