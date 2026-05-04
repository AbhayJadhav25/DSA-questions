import java.util.*;

public class MissingRepeatingNumber {
    static int[] missingRepeatingNumber( int arr[] ){
        int n = arr.length;
        int sn = (n*(n+1))/2;
        int s2n = (n*(n+1)*(2*n+1))/6;
        int s=0 , s2=0;

        for(int i=0;i<n;i++){
            s+=arr[i];
            s2+=arr[i]*arr[i];
        }

        int val1 = s - sn;
        int val2 = s2 - s2n;
        val2 = val2 / val1;
        int x = (val1+val2)/2;
        int y = x - val1;

        return new int[] {x,y};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements in an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res[] = missingRepeatingNumber(arr);
        System.out.println("Repeating Number : "+res[0]);
        System.out.println("Missing Number : "+res[1]);
        sc.close();
    }
}
