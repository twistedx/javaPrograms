import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Example2 implements Comparable<Final> {
  private static String first;
  private static String last;
  private static String email;
  private static String state;


  public static ArrayList<String> loadDatabase() {
    File f = new File("mock-data.csv");
    ArrayList<String> result = new ArrayList<>();
    try {
      Scanner inputFile = new Scanner(f);


      while (inputFile.hasNextLine()) {

        String[] temp = inputFile.nextLine().split(",");
        first = temp[0];
        last = temp[1];
        email = temp[2];
        state = temp[3];

      result.add(new Final(first, last, email, state));

      }



    } catch (FileNotFoundException e) {
      System.out.println("File is not found!");
    }
    return result;
  }


  public static String searchLetter(String search){
    if (getFirst().contains(search)){

    }
    return email;
  }
  public static String getFirst(){
    return first;
  }

  public static void main(String[] args){
    ArrayList<String> data = new ArrayList<>();
    loadDatabase();
    Scanner keyboard = new Scanner(System.in);

    System.out.println("== Domain Lookup ==");
    System.out.println("Enter some letters");


    System.out.println(data.size());
    System.out.println(data);
    String search = keyboard.nextLine();

    System.out.println(searchLetter(search));




  }

  @Override
  public int compareTo(Final o) {
    return 0;
  }
}


