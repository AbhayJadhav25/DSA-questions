public class MissingElement_8 {
    static int missingElement(int arr[]){
        int xOrSum = 0;
        
        for(int n:arr){
            xOrSum = xOrSum ^ n;
        }

        for(int i = 0 ; i<=arr.length+1 ; i++){
            xOrSum = xOrSum ^ i;
        }
        return xOrSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        int ans = missingElement(arr);
        System.out.println("Missing Element = "+ans);
    }
}
