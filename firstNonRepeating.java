import java.util.*;

public class firstNonRepeating {
  static char nonRepeat(String str) {
    int size = str.length();

    for (int i = 0; i < size; i++) {
      char ch = str.charAt(i);
      boolean isFound = false;
      for (int j = 0; j < size; j++) {
        if (i != j && ch == str.charAt(j)) {
          isFound = true;
          break;
        }
      }
      if (!isFound) {
        return ch;
      }
    }

    return '\0'; // if all characters are repeating
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.next();

    char ch = nonRepeat(str);

    if (ch == '\0') {
      System.out.println("No non-repeating character found");
    } else {
      System.out.println("First non-repeating character: " + ch);
    }

    sc.close();
  }
}
