import java.util.Scanner;

public class Ps01 {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number");
        float num = keyboard.nextFloat();

        if (num >= 30.5) {
            System.out.println("x is greater than or equal to 30.5");

        } else
            System.out.println("x is under 30.5");

    }
}
