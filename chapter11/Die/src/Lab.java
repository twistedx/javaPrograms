import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Lab {
  protected String temp1;

  public static boolean getWord(ArrayList<String> dict, String search) {
    int linNum = 0;
    Boolean temp1 = false;
    for (String temp : dict) {

      if (search.equals(temp)) {
        temp1 = true;
        System.out.println("\"" + search + "\"" + " is at index " + linNum);
      } else {
        linNum++;
      }
    }
    return temp1;
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    ArrayList<String> dict = new ArrayList<>();
    int counter = 0;

    try {
      File f = new File("dict.txt");
      Scanner inputFile = new Scanner(f);


      while (inputFile.hasNextLine()) {
        String temp = inputFile.nextLine();
        dict.add(temp);
        counter++;
      }


    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
    System.out.println(counter + " words were loaded.");
    boolean searchAgain = true;

    while (searchAgain) {


      System.out.println("What word are you looking for?");
      String search = keyboard.nextLine();
   //   getWord(dict, search);
      if (getWord(dict,search)) {

      }
      else {
        System.out.println("\"" + search + "\"" + " is at index -1");
      }
      System.out.println("Search again?");
      String temp = keyboard.nextLine();
      searchAgain = false;
      if (temp.equalsIgnoreCase("yes"))
        searchAgain = true;


    }
  }
}


