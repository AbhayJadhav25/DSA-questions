public class RemoveDuplicate_12 {
    static int removeDuplicate(int arr[]){
        int n = arr.length;

        int i = 0 , j = 1;
        while(j<n){
            if(arr[i]==arr[j]){
                j++;
            }else {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,3,4};
        int ans = removeDuplicate(arr);
        System.out.println("Length After removing Duplicate = "+ans);
    }
}
