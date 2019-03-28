import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Product extends Item
{



  public static ArrayList<Item> loadDataBase() throws FileNotFoundException {
   File f = new File("product.csv");
   java.util.Scanner inputFile = new Scanner(f);
   inputFile.nextLine();
   ArrayList<Item> productList = new ArrayList<>();

   while (inputFile.hasNextLine()){
     String line = inputFile.nextLine();
     String[] tokens = line.split(",");


     Product p = new Product(tokens[1], Service.dollarsToDouble(tokens[2]));

     productList.add(p);

   }
   return productList;
  }

public Product(String name, double price){
  super(name, price);
  }

  public String toString(){
  return "Product: " + super.toString();

  }



}
