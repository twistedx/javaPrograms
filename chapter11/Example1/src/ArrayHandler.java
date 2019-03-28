import java.util.Scanner;

public class ArrayHandler {
  public static void display(double[] numbers) {
    for (int x = 0; x < numbers.length; x++)
      System.out.println(x + " -> " + numbers[x]);
  }

  public static void insertValue(Scanner keyboard, double arr[]) {
    System.out.println("Enter a double");
    double num = keyboard.nextDouble();

    System.out.println("Where in the array should this number go?");
    int subscript = keyboard.nextInt();

    arr[subscript] = num;
  }
}
