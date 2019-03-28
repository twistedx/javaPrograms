import java.util.Scanner;

public class Ps05 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter block height");
        int base = keyboard.nextInt();

        if (base <= 0)
        {
            System.out.println("Height must at least be 1.");
        }else {

            for (int r = 0; r < base; r++) {
                for (int i = 0; i < (r + 1); i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


    }
}

