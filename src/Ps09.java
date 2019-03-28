import java.util.Scanner;
public class Ps09 {

        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a String");
            String input = keyboard.nextLine();

            int count = 0;

            for (int i = 0; i < input.length(); i++)
            {
                char temp = input.charAt(i);
                if (Character.isLowerCase(temp)) {
                    count++;
                }

            }

            System.out.println("Number of lower case characters: " + count);
        }
    }



