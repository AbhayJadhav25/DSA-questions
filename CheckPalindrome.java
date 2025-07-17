import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any String : ");
    String str = sc.next();
    String s = str.toLowerCase();
    String rev = "";
    for(int i=s.length()-1 ; i>=0;i--){
        rev =rev+ s.charAt(i);
    }

    if(s.equals(rev)){
        System.out.println("String is palindrome");
    }else{
        System.out.println("String is not palindrome");
    }
    sc.close();
}
}