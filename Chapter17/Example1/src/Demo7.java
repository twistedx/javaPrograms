import java.util.ArrayList;
import java.util.Scanner;

public class Demo7
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What should we sort on? Enter name, price, quantity, or total");
    String key = keyboard.nextLine();

    ArrayList<Product> arr = Product.loadSortedDatabase("MOCK_DATA.txt", key);

    for (Product p : arr)
    {
      System.out.println(p);
    }

    System.out.println("Found " + arr.size() + " items!");

    Product.loadDatabase("fail.txt");
    Product.loadDatabase("123.txt");
    Product.loadDatabase("abc.txt");
    Product.loadDatabase("bye.txt");
  }
}
