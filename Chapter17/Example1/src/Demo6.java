import java.util.ArrayList;

public class Demo6
{
  public static void main(String[] args)
  {
    ArrayList<Product> arr = Product.loadSortedDatabaseByQuantity("MOCK_DATA.txt");

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
