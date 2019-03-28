import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ErrorLog {

  private static ArrayList<String> dbGroup = new ArrayList<>();
  private static ArrayList<String> result = new ArrayList<>();

  public static void loadDatabase(String filename) throws FileNotFoundException {
    File f = new File(filename);
    Scanner inputFile = new Scanner(f);


    while (inputFile.hasNextLine()) {
      //take the next line in the log
      String line = inputFile.nextLine();

      //find the last position of ]
      int pos = line.lastIndexOf("]");
      // find that position then subtract off enough to capture the whole IP Address
      String tempip = line.substring(pos - 18, pos);

      // add the leftover into a string builder to perform edits Find the space infront of the IP and cut off the extra
      StringBuilder ip = new StringBuilder(tempip);
      int num2 = tempip.indexOf(" ");


      ip = ip.delete(0, num2 + 1);

      String temp2 = ip.toString();

      // add the results to an ArrayList with counter set to 0
//      System.out.println(temp2);
      if (temp2.contains(".") && temp2.contains(".")) {
        result.add(temp2);
  //    System.out.println("Pass through " + temp2);
      } else {
        inputFile.nextLine();
        inputFile.nextLine();
      }
    }
  }
      public static void ipCheck()
    {
        //set our compare to point
        String ip1 = "null";
        //initalize the counter with the first instance found, the search instance

        //perform a check to see if the DB is empty
        while (!result.isEmpty()) {
          int counter = 1;
          //Fire up the loop
          for (int i = 1; i < result.size(); i++) {
            ip1 = result.get(0);

            if (ip1.equals(result.get(i))) {
              counter++;
              result.remove(i);
              i--;
            }

          }
          //add the string to its own Database Group
          result.remove(0);
          dbGroup.add(ip1 + "," + String.valueOf(counter));


        }
      }
      public static void printResults (ArrayList < String > dbGroup) {
        int biggest = 0;
        int deleteMe = -1;
        String[] printString = {};
        String[] lastSaved = {};

        System.out.println("Found " + dbGroup.size() + " unique IP addresses.");
        System.out.println("The most suspicious are: ");

        for (int a = 0; a < 3; a++) {

          for (int b = 0; b < dbGroup.size(); b++) {
            String[] temp = dbGroup.get(b).split(",");
            int checkMe = Integer.valueOf(temp[1]);
            if (checkMe > biggest) {
              biggest = checkMe;
              printString = dbGroup.get(b).split(",");
              deleteMe = b;

            }

          }
          dbGroup.remove(deleteMe);
          biggest = 0;
          System.out.println(printString[0] + " (" + printString[1] + " erroneous accesses)");

        }
      }

      public static void main (String[]args) throws FileNotFoundException {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a log file to be analyzed");
        String filename = keyboard.nextLine();
        loadDatabase(filename);
        ipCheck();
//        System.out.println(dbGroup.size());
        printResults(dbGroup);
      }


    }





