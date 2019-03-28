import java.util.ArrayList;
import java.util.Scanner;

public class Demo8
{
  public static void main(String[] args)
  {
    ArrayList<Product> arr = Product.loadSortedDatabase("MOCK_DATA.txt", "both");

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
