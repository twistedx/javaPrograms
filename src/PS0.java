import java.util.Scanner;

public class PS0 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the first number:");
        float first = keyboard.nextFloat();
        System.out.println("Enter the second number:");
        float second = keyboard.nextFloat();

        System.out.println("Product: " + (first * second));

    }

}
