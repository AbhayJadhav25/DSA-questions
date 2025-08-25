import java.util.*;
import java.lang.Math;

public class BuySellStock {
  static int buySellStck(int nums[]) {
    int curr_profit = 0, max_profit = 0, buy_price = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < buy_price) {
        buy_price = nums[i];
      } else {
        curr_profit = nums[i] - buy_price;
      }
      max_profit = Math.max(max_profit, curr_profit);
    }
    return max_profit;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of an array : ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    System.out.println("Enter " + size + " elements in an array : ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int res = buySellStck(arr);
    System.out.println("Max profit : " + res);
    sc.close();
  }
}
