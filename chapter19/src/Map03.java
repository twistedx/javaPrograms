import java.io.File;
import java.io.FileNotFoundException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map03 {
  public static Map<String, Integer> word_count = new HashMap<>();


  public static void main(String[] args) {
    int count = 0;
    String mostWord = "";

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a file name");
    String name = keyboard.nextLine();
    System.out.println("Opening " + name);
    File f = new File(name);
    try {
      Scanner inputFile = new Scanner(f);

      while (inputFile.hasNext()) {
        String line = inputFile.next();
        if (line.length() > 5) {
          if (word_count.keySet().contains(line)) {
            int up = word_count.get(line);
            word_count.put(line, up += 1);

          } else {
            word_count.put(line, 1);
          }
        }
      }

      Integer frequency = null;
      String mostFrequent = null;
      for (String s : word_count.keySet()) {
        Integer i = word_count.get(s);
        if (frequency == null)
          frequency = i;
        if (i > frequency) {
          frequency = i;
          mostFrequent = s;
        }
      }
      System.out.println("Most common word");
      System.out.println(mostFrequent + " -> " + frequency);

    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }


  }
}
