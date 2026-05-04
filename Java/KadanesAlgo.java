import java.util.*;
class KadanesAlgo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter "+size+" elements in an array : ");
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE , currSum=0;
        for(int i=0 ; i<arr.length;i++){
            currSum+=arr[i];
            if(currSum>maxSum){
                maxSum = currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println("Maximum subarray sum : " + maxSum);
        sc.close();
    }
}