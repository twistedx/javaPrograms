import java.util.ArrayList;
import java.util.Scanner;

public class ps01 {
        private static boolean keepGoing = true;
        private static ArrayList<Integer> data = new ArrayList<>();

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);


        while (keepGoing){

            System.out.println("Enter an integer (0 to exit)");
           int a = keyboard.nextInt();

           if (a == 0 ){
               System.out.println("Got it.  You entered:");
               for (Integer temp : data)
               System.out.println(temp);
               keepGoing = false;
           }
           else{
               data.add(a);
           }

        }
    }
}
