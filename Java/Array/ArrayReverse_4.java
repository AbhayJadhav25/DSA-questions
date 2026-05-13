class ArrayReverse_4{
    public static int[] reverseArray(int arr[]){
        int left = 0 , right = arr.length -1 ;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
    public static void main(String a[]){
        int arr[] = {2,4,6,8,9 , 7};
        int ans[] = reverseArray(arr);

        for(int n :ans){
            System.out.print(n+" ");
        }
    }
}