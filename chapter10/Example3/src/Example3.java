import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Example3 {

  public static void main(String[] args) throws FileNotFoundException {

    PercentoffCart cart = new PercentoffCart();

    ArrayList<Item> itemList = Service.loadDataBase();

    cart.addProduct(itemList.get(0));
    cart.addProduct(itemList.get(1));
    cart.addProduct(itemList.get(2));
    
    double totalWithDiscount = cart.getTotal();
    System.out.println("Cost with discount: " + totalWithDiscount);

    double beforeDiscount =cart.getTotalBeforeDiscount();
    System.out.println("Cost before Discount " + beforeDiscount);



  }
}
