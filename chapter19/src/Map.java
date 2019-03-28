import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static HashMap<String, Integer> countWordFrequency(String textFile) throws IOException {

        HashMap<String, Integer> mapper = new HashMap<String, Integer>();
        String line = null;
        Scanner inputFile = new Scanner(new File(textFile));


        while ((inputFile.nextLine() != null)) {
            String[] words = new String[0];
          {
                words = line.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ");
            }
            for (String word : words) {
                if (!word.isEmpty()) {
                    Integer freq = mapper.get(word);
                    if (freq == null) {
                        mapper.put(word, 1);
                    } else {
                        mapper.put(word, freq + 1);
                    }
                }
            }

            inputFile.close();
        }
        return mapper;
    }


    public static int maxFrequency(HashMap<String, Integer> mapper) {
        int maxValue = Integer.MIN_VALUE;
        for (int value : mapper.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    /*This method prints the HashMap Key with a particular Value.
     */
    public static void printWithValue(HashMap<String, Integer> mapper, Integer value) {
        for (java.util.Map.Entry<String, Integer> entry : mapper.entrySet()) {
            if (entry.getValue().equals(value)) {
                System.out.println("Word : " + entry.getKey() + " \nFrequency : " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a file name");
        String name = keyboard.nextLine();
        HashMap<String, Integer> data = new HashMap<>();

        try {

           data = countWordFrequency(name);
        printWithValue(data, maxFrequency(data));



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
