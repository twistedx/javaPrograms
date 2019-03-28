import java.util.Scanner;

public class Example2 {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    boolean keepGoing;

    do {
      keepGoing = false;

      System.out.println("How many sides for this die?");
      int input = keyboard.nextInt();
      System.out.println("How many times should we roll?");
      int numRolls = keyboard.nextInt();

      try {
        Die test = new Die(input);
        for (int i = 0; i <= numRolls; ) {
          test.roll();
          System.out.println(test.getValue());
          i++;
        }
      } catch (IllegalArgumentException e) {
        System.out.println("Requires at least 4 sides");
        keepGoing = true;
      }

    } while (keepGoing);


  }
}
