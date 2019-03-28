import java.util.Scanner;

public class Hashing {

  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a string of digits");
    String temp = keyboard.nextLine();
    int a = 0;

    for (int i = 0; i < temp.length(); i++){
      int b = Character.getNumericValue(temp.charAt(i));
       a= a + b;
    }

    System.out.println("Sum of digits: " + a);



  }
}
