public class ShiftArrayBy1Pos_5 {
    public static void shifyBy1(int arr[]){
        int n = arr.length;

        int last = arr[n-1];

        for(int i = n-1 ; i>0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        shifyBy1(arr);
    }
}
