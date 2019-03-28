import java.util.Scanner;

public class Ps02 {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter three numbers: left right x");
        float left = keyboard.nextFloat();
        float right = keyboard.nextFloat();
        float x = keyboard.nextFloat();
        if (x == left)
        {
            System.out.println(x + " is within the range ["+ left + ", " + right +"]");
        } else
         if (left >= x || x >= right )

         {
             System.out.println(x +  " is outside the range ["+ left + ", " + right +"]");

         } else
         {
             System.out.println(x + " is within the range ["+ left + ", " + right +"]");

         }

    }
}
