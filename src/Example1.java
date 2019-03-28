import java.util.Scanner;

public class Example1 {

  public static boolean isValid(String pass)
  {
  if (pass.length() < 6)
    return false;
    int uppercaseCounter = 0;
    int lowercaseCounter = 0;
    int digitCounter = 0;

    for (int subscript = 0; subscript < pass.length(); subscript++)
    {
    char current = pass.charAt(subscript);

    if (Character.isUpperCase(current))
      uppercaseCounter++;
    else if (Character.isLowerCase(current))
      lowercaseCounter++;
    else if (Character.isDigit(current))
      digitCounter++;

    }

    return uppercaseCounter >=3 && lowercaseCounter >=3 && digitCounter >=1;
  }
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to our site!");
    System.out.println("Enter a new password");
    String pass = keyboard.nextLine();

    if (isValid(pass))
      System.out.println("Password Accepted welcome to the site!");
    else
      System.out.println("Invalid! Try again");

    System.out.println(pass);
  }
}
