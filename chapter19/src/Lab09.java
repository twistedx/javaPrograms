import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Lab09 {
  private static TreeSet<String> data = new TreeSet<>();

  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter name of movie file");
    String name = keyboard.nextLine();

    File f = new File(name);
    try {
      Scanner inputFile = new Scanner(f);

      while(inputFile.hasNext()){
        data.add(inputFile.nextLine());
      }
    System.out.println("Number of unique movies: " + data.size());


    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }


  }
}
