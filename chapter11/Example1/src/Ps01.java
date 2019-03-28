import java.util.Scanner;

public class Ps01 {

  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter some text:");
    String a = keyboard.nextLine();
    System.out.println("Here are the digits in that text:");
    char[] b = a.toCharArray();
    StringBuilder c = new StringBuilder();
    for (int i = 0; i < a.length(); i++){
      if (Character.isDigit(b[i])){
        c.append(b[i]);
      }

    }

    System.out.println(c.toString());

  }
}
