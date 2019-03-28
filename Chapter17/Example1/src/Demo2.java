public class Demo2
{
  public static void main(String[] args)
  {
    Product[] arr = {
        new Product("Fire TV", 50.25, 23),
        new Product("Echo Dot", 192.85, 50),
        new Product("Wyze Cam", 57, 20),
        new Product("Super Smash Bros. Ultimate"),
        new Product("Diary of a Wimpy Kid", 9, 200),
        new Product("Lego City"),
    };

    for (Product p : arr)
    {
      System.out.println(p);
    }
  }
}
