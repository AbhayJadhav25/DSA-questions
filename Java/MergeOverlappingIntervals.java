import java.util.*;

public class MergeOverlappingIntervals {
  static int[][] mergeOverLapping(int[][] intervals) {
    if (intervals.length <= 1) {
      return intervals;
    }
    Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
    ArrayList<int[]> res = new ArrayList<>();

    int[] newInterval = intervals[0];
    res.add(newInterval);

    for (int[] interval : intervals) {
      if (interval[0] <= newInterval[1]) {
        newInterval[1] = Math.max(interval[1], newInterval[1]);
      } else {
        newInterval = interval;
        res.add(newInterval);
      }
    }
    return res.toArray(new int[res.size()][]);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows : ");
    int row = sc.nextInt();
    System.out.println("Enter number of columns : ");
    int cols = sc.nextInt();

    int arr[][] = new int[row][cols];

    System.out.println("Enter elements in an array : ");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    int[][] res = mergeOverLapping(arr);

    System.out.println("Array after merging overlapping : ");
    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[i].length; j++) {
        System.out.print(res[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}
