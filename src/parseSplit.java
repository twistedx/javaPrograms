import java.util.Scanner;

public class parseSplit {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter ingredients");
        String entry = keyboard.nextLine();
        String clean = "";

        String[] moreTokens = entry.split("[>:]");

        for (String temp :moreTokens)
        {
        clean= temp.trim();
        System.out.println(clean);
    }
    }
}
