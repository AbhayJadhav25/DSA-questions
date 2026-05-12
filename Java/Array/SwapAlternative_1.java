class SwapAlternative_1{
    public static int[] swapAlternative(int arr[]){
    int n = arr.length;
    for(int i=0 ; i<n-1 ; i+=2){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    return arr;
}
    public static void main(String a[]){
        int arr[] = {1,2,3,4,5,6};
        int arr1[] = swapAlternative(arr);

        for(int n : arr1){
            System.out.print(n+"  ");
        }
    }
}