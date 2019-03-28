import java.util.Scanner;

public class Example4 {

  public static String unformat(String number)
  {
  StringBuilder result = new StringBuilder(number);
  result.deleteCharAt(0);
  result.deleteCharAt(3);
  result.deleteCharAt(3);
  result.deleteCharAt(6);
  return result.toString();

  }

  public static String format(String number)
  {
   StringBuilder result = new StringBuilder(number);
    result.insert(0, '(');  //insert this at the beginning
    result.insert(4, ") ");
    result.insert(9, '-');
    return result.toString();
  }

  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter an unformatted phone number");
    String number = keyboard.nextLine();
    System.out.println(format(number));
    System.out.println("Enter a formatted phone number ex(805) 555-5454");
    String number2 = keyboard.nextLine();
    System.out.println(unformat(number2));




  }
}
