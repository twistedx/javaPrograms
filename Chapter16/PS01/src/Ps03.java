import java.util.ArrayList;
import java.util.Scanner;

public class Ps03 {

    private static ArrayList<Character> a = new ArrayList<>();
    private static String possible;

    public static void printPass(String pass) {
        char temp = 'a';
        for (int i = 0; i < a.size(); ) {
            temp = a.get(i);

            if (temp == '1') {
                possible = "1";
                i += 1;

            } else if (temp == '2') {
                possible = "ABC";
                i += 1;
            } else if (temp == '3') {
                possible = "DEF";
                i += 1;
            } else if (temp == '4') {
                possible = "GHI";
                i += 1;
            } else if (temp == '5') {
                possible = "JKL";
                i += 1;
            } else if (temp == '6') {
                possible = "MNO";
                i += 1;
            } else if (temp == '7') {
                possible = "PQRS";
                i += 1;
            } else if (temp == '8') {
                possible = "TUV";
                i += 1;
            } else if (temp == '9') {
                possible = "WXYZ";
                i += 1;
            } else if (temp == '0') {
                possible = "0";
                i += 1;
            } else {
                System.out.println(pass);
            }
            System.out.println(possible);
            for (int j = 0; j < possible.length(); j++) {
                printPass(pass + possible.charAt(j));
            }
        }
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a phone number (numbers only).");
        String num = keyboard.nextLine();
        for (int i = 0; i < num.length(); i++) {
            a.add(i, num.charAt(i));
        }
        System.out.println(a);
        printPass("");
    }
}



