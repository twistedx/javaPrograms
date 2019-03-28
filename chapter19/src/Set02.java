import java.util.Scanner;
import java.util.TreeSet;


public class Set02 {

    private static boolean keepGoing = true;
    private static TreeSet<String> data = new TreeSet<>();


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 10 words");
        int i = 1;

        while (keepGoing) {

            System.out.println("Enter word " + i);
            data.add(keyboard.next());
            i += 1;

            if (i == 11) {
                keepGoing = false;
            }


        }
        System.out.println("Here is that data without duplicates:");
        for (String temp : data){
            System.out.println(temp);
        }

    }
}
