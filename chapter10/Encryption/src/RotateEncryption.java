import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class RotateEncryption extends Encryption {
    public RotateEncryption(String filename, int key) throws FileNotFoundException {
        super(filename);
        this.key = key;
    }
    private int key;


    protected String ab = "File is too short!";

    public String getLine(int which) {
        ArrayList<String> listOfData = new ArrayList<>();
        File f = new File(super.filename);
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line1 = "";

        int counter = -1;


        while (inputFile.hasNextLine()) {
            String line = inputFile.nextLine();
            counter++;
            if (counter == which) {
                line1 = line;
            }
            listOfData.add(line);

        }
        int a = listOfData.size();
        if (a < which) {

            return ab;
        }

        return line1;
    }

    @Override
    public String getEncryptedLine(int which) {

        ArrayList<String> listOfData = new ArrayList<>();
        File f = new File(super.filename);
        Scanner inputFile = null;
        int counter = -1;
        try {
            inputFile = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line1 = "";

        while (inputFile.hasNextLine()) {
            String line = inputFile.nextLine();
            counter++;
            if (counter == which) {
                line1 = line;

            }

            listOfData.add(line);

        }
        String a = letterShift(line1, key);

        return a;
    }

    public static String letterShift(String line, int key) {

        StringBuilder results = new StringBuilder();
        int d = 0;
        char after = 'a';

            for (d = 0; d < line.length(); d++) {
                char before = line.charAt(d);


                if (Character.isLetter(before)) {

                    if (Character.isUpperCase(before)) {
                        after = (char) ((before - 'A' + key) % 26 + 'A');
                        results.append(after);

                    } else if (Character.isLowerCase(before)) {
                        char ch = (char) (((int) line.charAt(d) +
                                key - 97) % 26 + 97);
                        results.append(ch);

                    }
                } else {
                    results.append(before);
                }

            }

            if (results.length() <= 13 ){
               String ab = "File is too short!";
                String temp = letterShift(ab,key);
          //      System.out.println(temp);
                results.append(temp);
                results.delete(0,13);

            }
       // results.insert(0, "Cipher text: ");

        return results.toString();
    }
}