import java.util.*;
public class MajorityElement {
    static int majorityElement(int arr[]){
        int majority = arr[0] , votes =1;
        for(int i=1 ; i<arr.length ; i++){
            if(votes==0){
                votes++;
                majority = arr[i];
            }else if(majority == arr[i]){
                votes++;
            }else{
                votes--;
            }
        }
        
    //     int count =0;
    //     for(int num:arr){
    //         if(num==majority){
    //             count++;
    //         }
    //     }
    //     if(count> arr.length/2){
    //         return majority;
    //     }else{
    //         return -1;
    //     }
    // 
        return majority;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter "+size+" elements in an array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int majority = majorityElement(arr);
            System.out.println("Majority Element : "+majority);
        sc.close();
    }
}
