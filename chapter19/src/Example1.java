import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Example1 {

  public static TreeSet<Movie> loadDatabase(){
    File f = new File("movie_list.txt");
    TreeSet<Movie> result = new TreeSet<>();
    try {
      Scanner inputFile = new Scanner(f);

      while(inputFile.hasNextLine())
        result.add(new Movie(inputFile.nextLine(), inputFile.nextLine(), inputFile.nextLine()));

    } catch (FileNotFoundException e) {
      System.out.println("File is not found!");
    }
    return result;
  }

  public static void main(String[] args){

    TreeSet<Movie> data = loadDatabase();

    for (Movie current : data){
      System.out.println(current);

      System.out.println("Num movies above: " + data.size());
    }

  }

}
