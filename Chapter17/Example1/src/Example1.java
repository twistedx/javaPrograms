import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Example1 {

  public static void selectionSort(ArrayList<Integer> data){
    // loop that controls passes
    int numPasses = 0;

    for (int subscript = 0; subscript < data.size() - 1; subscript++){
      int smallIndex = subscript;
      int smallValue = data.get(subscript);
      int numSwaps = 0;
      int passLength = 0;
      //swap loop
      for (int current = subscript; current < data.size(); current++){
        if (data.get(current) < smallValue){
          smallIndex = current; // where that msall value is
          smallValue = data.get(current); //what that small value is
        }
        passLength++;
      }
      int t = data.get(subscript);  //int t = x
      data.set(subscript, smallValue);//x = y
      data.set(smallIndex, t);// y = t
      numSwaps++;
      numPasses++;
     // System.out.println("Pass #: " + numPasses + " # swamps " + numSwaps + " # of iterations on this swap " + passLength);
    }
  }

  public static void bubbleSort(ArrayList<Integer> data) {

    int numSwaps = 0;
    int numPassess = 0;

    //this "for" loop handles the passes
    boolean swap = true;

    while (swap) {

      swap = false;
      numPassess++;
      numSwaps = 0;
      //this for loop asks "are you two in the right order? Then swaps as needed"
      for (int current = 0; current < data.size() - 1; current++) {
        // if these two elements are in the wrong order
        if (data.get(current) > data.get(current + 1)) {
          int t = data.get(current);
          data.set(current, (data.get(current + 1)));
          data.set(current + 1, t);
          swap = true;
          numSwaps++;
        }
      }
      System.out.println("On pass " + numPassess + " there were " + numSwaps + " swaps");
    }
  }

  public static ArrayList<Integer> generateData(int size) {
    Random rng = new Random();
    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 0; i < size; i++) {
      int newElement = rng.nextInt(1000000) + 1; //1 - 1000000
      result.add(newElement);
    }

    return result;
  }


  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("How many random elements should be generated?");
    System.out.println("All these elements will be sorted.");
    int inputSize = keyboard.nextInt();

    System.out.println("Generating Data...");
    ArrayList<Integer> data = generateData(inputSize);
    //bubbleSort(data);
    Quick.sort(data, 0 , data.size() -1);
    System.out.println("Sorting Data...");
    System.out.println("Here are all the elements:");

    int counter = 0;
    for (Integer current : data) {
      System.out.println(counter + " : " + current);
      counter++;
    }

  }

}
