import java.util.Scanner;

public class CaseDemo2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a String");
        StringBuilder sb = new StringBuilder(keyboard.nextLine());
        System.out.println("Which characters should be converted to uppercase?");
        String chars = keyboard.nextLine();

        ParsingUtils.changeLetter(sb, chars);

        System.out.println(sb);
    }
}
