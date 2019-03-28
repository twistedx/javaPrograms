import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Example5 {


  public static void main(String[] args) throws FileNotFoundException {
    ArrayList<User> db = loadDatabase("MOCK_DATA.csv");
    String userInput = getCountry();
    printPeople(userInput, db);
  }

  public static ArrayList<User> loadDatabase(String filename) throws FileNotFoundException {
    File f = new File(filename);
    Scanner inputFile = new Scanner(f);
    ArrayList<User> result = new ArrayList<>();

    inputFile.nextLine();// read and throw away headers (See MOCK_DATA)
    while (inputFile.hasNextLine())
    {
      String line = inputFile.nextLine();
      //array of size 6
      String[] tokens = line.split(",");
      String firstName = tokens[1];
      String lastName = tokens[2];
      String email = tokens[3];
      String country = tokens[4];
      //make the user object
      User myUser = new User(firstName,lastName,email,country);
      //put this new user in the ArrayList<>
      result.add(myUser);
    }
    return result;
  }

  public static String getCountry()
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a country name");
    String country = keyboard.nextLine();

    return country;
  }


  public static void printPeople(String country, ArrayList<User> db) {
    int numMatches = 0;
    for (User current : db)
      if (current.livesIn(country)) {
        System.out.println(current);//println Calls toString
        numMatches++;
      }
      System.out.println("Number of people that live in " + country + " " + numMatches);
  }
}
