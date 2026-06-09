public class PivotIndex_14 {
    static int solution(int arr[]){
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];

        int rightSum = 0;
        int leftSum = 0;
        left[0] = arr[0];
        right[n-1] = arr[n-1];

        for(int i =1 ; i< n ;i++){
            left[i] = left[i-1] + arr[i];
        }

        for(int i = n-2 ; i>=0 ; i--){
            right[i] = right[i+1]+arr[i];
        }

        for(int i = 0 ; i<n ; i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        int ans = solution(arr);
        System.out.println(ans);
    }
}
