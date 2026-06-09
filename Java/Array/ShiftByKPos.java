public class ShiftByKPos {

    static void shiftByKPosition(int arr[] , int k){
        int temp[] = new int[k];

        int n = arr.length;
        int temp_var = arr[k];

        //strore last l digits in temp[]
        for(int i = 0 ; i<k ; i++){
            temp[i] = arr[n-k+i];
        }

        for(int i=0 ; i<k ; i++){
            arr[i+k] = arr[i];
        }
        arr[n-1] = temp_var;

        n = temp.length;
        for(int i = 0 ; i<temp.length ; i++){
            arr[i] = temp[i];
        }

        for(int nums : arr){
            System.out.print(nums+" ");
        }
    }

    static void shiftByKPosition2(int arr[] , int k){
        int temp[] = new int[arr.length];
        
        int n = arr.length;

        for(int i=0 ; i<arr.length ; i++){
            temp[(i+k)%n] = arr[i];
        }

        for(int nums : temp){
            System.out.print(nums+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
         shiftByKPosition(arr , 4);
    
        // System.out.print("Array Before Shifting =  ");
        // for(int nums : arr){
        //     System.out.print(nums+" ");
        // }

        // System.out.println("Array After Shifting = ");
        // for(int nums : arr){
        //     System.out.print(nums+" ");
        // }
    }
}
