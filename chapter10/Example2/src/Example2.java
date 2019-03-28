import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Example2 {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Item> serviceList = Service.loadDataBase();
    ArrayList<Item> productList = Product.loadDataBase();

    double totalCost = calculateTotalCost(serviceList);
    System.out.printf("Service Total:  %.2f\n", totalCost);

    double totalCostProducts = calculateTotalCost(productList);
    System.out.printf("Product Total: %.2f\n", totalCostProducts);
  }

  public static double calculateTotalCost(ArrayList<Item> db){
    double totalCost = 0;
    for (Item temp : db){
      System.out.println(temp);
      totalCost += temp.getTotalCost();
    }
    return totalCost;
  }

}
