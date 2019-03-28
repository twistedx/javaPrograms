import java.util.Scanner;

public class Ps06 {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String text = keyboard.nextLine();

        System.out.println(text.toUpperCase());

    }
}
