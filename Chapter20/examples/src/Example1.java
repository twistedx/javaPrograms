import java.util.Random;

public class Example1 {

  public static void main(String[] args){
    MyLinkedList<String> data = new MyLinkedList<>();


    data.add("X");
    data.add("X");
    data.add("X");
    data.add("R");
    data.add("X");
    data.add("X");
    data.add("X");

//    data.add("D");
//    data.add("E");
//    data.add("F");
//
//    data.add(2, "X");
//    data.add(2, "Y");
//    data.add(5, "Z");
//
//    data.remove(4);
//    data.remove(1);
//    data.remove(0);
    data.remove("X");
    data.remove("A");
    data.remove("I dont Exist");
    data.remove("X");
    data.remove("x");

    System.out.println("Size: " + data.size());

    for (int i = 0; i < data.size(); i++){
      System.out.println(data.get(i));
    }
    Random rng = new Random();
    MyLinkedList<Integer> bigList = new MyLinkedList<>();

    for (int counter = 1; counter <= 10; counter++){
      int newData = rng.nextInt();
      System.out.println("Adding " + newData + " at position " + counter);
      bigList.add(newData);
    }

  }
}
