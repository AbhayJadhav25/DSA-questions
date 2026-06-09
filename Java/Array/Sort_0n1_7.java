public class Sort_0n1_7 {
    static int[] sort(int arr[]){
        int n = arr.length;

        int i = 0;
        int j = n-1;

        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,0,1,1,0,1};
        int ans[] = sort(arr);

        System.out.println("Array After Sorting");
        for(int nums : ans){
            System.out.print(nums+" ");
        }
    }
}
