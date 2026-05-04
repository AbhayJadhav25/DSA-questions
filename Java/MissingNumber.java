import java.util.*;
public class MissingNumber {
    static int missingNumber(int nums[]){
        int xor = 0;
        int n = nums.length;
        for(int i=0 ; i<=n;i++){
            xor = xor^i;
        }
        for(int num : nums){
            xor = xor^num;
        }
        return xor;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter "+size+" elements in an array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int missingNumber = missingNumber(arr);
        System.out.println("Missing Number : "+missingNumber);
        sc.close();
    }
}
