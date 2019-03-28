import java.util.Scanner;

public class ps01 {

    private static StringBuilder a = new StringBuilder();
    private static boolean firstRun;

    public static String sayBackwards(StringBuilder entry) {

                if (a.length() > 1) {
                System.out.println(a.substring(a.length() - 1));
                a.deleteCharAt(a.length() -1);
                sayBackwards(a);
                return "";
            }
            else if (a.length() == 1) {System.out.println(a.toString());}
        return "";
    }

        public static void main (String[]args){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a String");
            StringBuilder temp = a.append(keyboard.nextLine());
            sayBackwards(temp);

        }
    }
