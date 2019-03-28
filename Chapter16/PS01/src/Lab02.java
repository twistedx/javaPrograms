import java.util.Scanner;

public class Lab02 {

    private static StringBuilder a = new StringBuilder();

    public static String sayForwards(int subscript, StringBuilder entry) {

      if (subscript < a.length()) {
        System.out.println(a.charAt(subscript));
        sayForwards(subscript + 1, a);
        return "";
      }
      else if (subscript == a.length()){ }
      return "";
    }

    public static void main (String[]args){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter a String");
      StringBuilder temp = a.append(keyboard.nextLine());
      sayForwards(0, temp);

    }
  }


