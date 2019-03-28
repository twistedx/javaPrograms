import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example3 {

  public static void main(String[] args) throws FileNotFoundException {
  //open the file
    File f = new File("database.txt");
    //read the file
    Scanner inputFile = new Scanner(f);

    while (inputFile.hasNextLine())
    {
      //get the next line
      String line = inputFile.nextLine();
      Person p = new Person(line);
      p.printReport();
      System.out.println("----------------");
    }

  }
}
