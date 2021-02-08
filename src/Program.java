import java.util.Scanner;
import java.util.Stack;

public class Program {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();;

    if(parsing(s))  System.out.println("Скобки симметричны!");

    if(!parsing(s))  System.out.println("Скобки не симметричны!");

  }

  public static boolean parsing(String str) {
    int check = 0;
    for (int i = 0; i < str.length(); i++) {
      if (check < 0) {
        return false;
      }
      String symbol = str.substring(i, i + 1);
      if (symbol.equals("(") || symbol.equals("{") || symbol.equals("[")) {
        check++;
        continue;
      }
      if (symbol.equals(")") || symbol.equals("}") || symbol.equals("]"))
        check--;
    }
    if (check == 0) {
      return true;
    } else {
      return false;
    }
  }
}