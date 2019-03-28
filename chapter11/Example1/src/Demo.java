import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {


  public static void main(String[] args) {
    double[] input = new double[5];
    Scanner keyboard = new Scanner(System.in);


      for (int i = 0; i < 5;) {
        try {
        ArrayHandler.insertValue(keyboard, input);
        ArrayHandler.display(input);
        i++;
        } catch (InputMismatchException e)
        {
          System.out.println("That's not a double! Try again.");
          keyboard.nextLine();
        }
        catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Out of bounds! Try again.");
        }

      }
      //outside array boundery, input needs to be loop,

  }
}
