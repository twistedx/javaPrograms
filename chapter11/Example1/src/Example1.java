import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {

  public static void main(String[] args) {
    File f = new File("data.txt");
    try {
      Scanner inputFile = new Scanner(f);
      int total =  0;
      while (inputFile.hasNextLine()) {

        try {
          int num = inputFile.nextInt();
          total += num;
          System.out.println(num);

        } catch (InputMismatchException e) {
          System.out.println("Found a non integer. What should we do?");
            inputFile.nextLine();//push file cursor beyond bad stuff
        }


      }
      System.out.println("Total value: " + total);
    } catch (FileNotFoundException e) {
      System.out.println("Could not open that file. Try again!");
    } catch (InputMismatchException e) {
      System.out.println("Found a non integer. What should we do?");
    }
  }
}
