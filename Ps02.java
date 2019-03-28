import java.util.Scanner;

public class Ps02 {
    private static int num;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the maximum number of characters");
        num = keyboard.nextInt();
        letterCombos();
    }

    public static void letterCombos() {
        combos("");

    }

    private static void combos(String counter) {
        if (counter.length() == num) //base case
            System.out.println(counter);
        else {//recursive case
            combos(counter + "A");
            combos(counter + "B");
            combos(counter + "C");
        }
    }
}
