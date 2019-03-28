import java.util.ArrayList;
import java.util.Scanner;

public class Ps02 {
    private static ArrayList<String> a = new ArrayList<>();
    private static String num="";
    private static int p;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing;
        do {
            keepGoing = false;
            a.clear();

            if (!num.equalsIgnoreCase("exit")){
                System.out.println("Enter a phone number (numbers only). Type \"exit\" to end.");
                num = keyboard.nextLine();

                for (int i = 0; i < num.length(); i++) {
                    a.add(i, num);
                }
                combos("", a, 0);
                keepGoing = true;
                if (!num.equalsIgnoreCase("exit")) {
                    System.out.println(p + " option(s) are available");
                    p = 0;
                }

            }else{
                System.out.println("Bye!");
                System.exit(0);
            }
        } while (keepGoing);
    }

    private static void combos(String counter, ArrayList<String> a, int i) {

        if (a.size() == counter.length()) {
            System.out.println(counter);
            p +=1;
        } else if (a.get(i).charAt(i) == '1') {
            combos(counter + "1", a, i + 1);
        }else if (a.get(i).charAt(i) == '2') {
            combos(counter + "A", a, i + 1);
            combos(counter + "B", a, i + 1);
            combos(counter + "C", a, i + 1);
        } else if (a.get(i).charAt(i) == '3') {
            combos(counter + "D", a, i + 1);
            combos(counter + "E", a, i + 1);
            combos(counter + "F", a, i + 1);
        } else if (a.get(i).charAt(i) == '4') {
            combos(counter + "G", a, i + 1);
            combos(counter + "H", a, i + 1);
            combos(counter + "I", a, i + 1);
        } else if (a.get(i).charAt(i) == '5') {
            combos(counter + "J", a, i + 1);
            combos(counter + "K", a, i + 1);
            combos(counter + "L", a, i + 1);
        } else if (a.get(i).charAt(i) == '6') {
            combos(counter + "M", a, i + 1);
            combos(counter + "N", a, i + 1);
            combos(counter + "O", a, i + 1);
        } else if (a.get(i).charAt(i) == '7') {
            combos(counter + "P", a, i + 1);
            combos(counter + "Q", a, i + 1);
            combos(counter + "R", a, i + 1);
            combos(counter + "S", a, i + 1);
        } else if (a.get(i).charAt(i) == '8') {
            combos(counter + "T", a, i + 1);
            combos(counter + "U", a, i + 1);
            combos(counter + "V", a, i + 1);
        } else if (a.get(i).charAt(i) == '9') {
            combos(counter + "W", a, i + 1);
            combos(counter + "X", a, i + 1);
            combos(counter + "Y", a, i + 1);
            combos(counter + "Z", a, i + 1);
        } else if (a.get(i).charAt(i) == '0') {
            combos(counter + "0", a, i + 1);
        }
    }
}
