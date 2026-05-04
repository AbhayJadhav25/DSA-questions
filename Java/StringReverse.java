import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
            String str = sc.nextLine();
            String rev = "" ;
            for(int i=str.length()-1 ; i>=0;i--){
                rev = rev+str.charAt(i);
            }
            System.out.println("Reverse string : "+rev);
            sc.close();
        }
    }

