import java.io.*;
import java.util.Scanner;

public class Example3 {

  public static void createTextFile(int bigNum){
    try {

      PrintWriter outputFile = new PrintWriter("test.txt");
      outputFile.print(bigNum);
      outputFile.close();//write buffer to file
    }
    catch (FileNotFoundException e)
    {


    }
  }
  public static void createBinaryFile(int bigNum){

    try {
      FileOutputStream out = new FileOutputStream("test.dat");
      DataOutputStream outputFile = new DataOutputStream(out);
      outputFile.write(bigNum);
      outputFile.close();

    }
    catch (FileNotFoundException e) {
     System.out.println("Could not create test.dat");
    }
    catch (IOException e){
      System.out.println("Could not find the output file");
    }

  }


  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Text file versus Binary File ");
    System.out.println("Enter some text to convert to binary");
    int temp = keyboard.nextInt();

    createTextFile(temp);
    createBinaryFile(temp);

  }
}
