public class UniqueElement_9 {
    static int uniqueElement(int arr[]){
        int n = arr.length;
        int xOrSum = 0;
        for(int num : arr){
            xOrSum = xOrSum ^ num;
        }
        return xOrSum;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,4,5,3,4};
        int ans = uniqueElement(arr);
        System.out.println("Unique Element = "+ans);
    }
}
