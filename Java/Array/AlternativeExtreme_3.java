//I/p : 1 2 3 4 5 6
//O/p : 1 6 2 5 3 4


public class AlternativeExtreme {
    public static int[] alternativeExtreme(int arr[]){
        int arr1[] = new int[arr.length];
        int left = 0 , right = arr.length-1;
        int i =0;
        while(left<right){
            arr1[i++] = arr[left];
            arr1[i++] = arr[right];
            left++;
            right--;
        }
        if(left==right){
            arr1[i] = arr[left];
        }
        return arr1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int ans[] = alternativeExtreme(arr);
        
        for(int n : ans){
            System.out.print(n+"  ");
        }
    }
}
