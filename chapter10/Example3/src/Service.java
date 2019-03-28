import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Service extends Item
{
  private double totalHours;
  private double pricePerHour;

  // static keyword allows us to do service.loadDatabase(); call method on class
  public static ArrayList<Item> loadDataBase() throws FileNotFoundException {
    File f = new File ("Service.csv");
    Scanner inputeFile = new Scanner(f);
    ArrayList<Item> listOfServices = new ArrayList<>();
    inputeFile.nextLine(); // skip over csv headers

    while (inputeFile.hasNextLine())
    {
      //get next line of text (Line is CSV)
     String line = inputeFile.nextLine();
     //Break Line at the comma
     String[] tokens = line.split(",");
      //Token [0] is ID example - 1,
      //Token [1] is name - Human Resources Assistant II,
      //Token[2] Price Per hour - $7.20,
      //Token[3] Total Hours - 36


      //Parse the data make a new Service Object
     Service s = new Service(tokens[1],Double.parseDouble(tokens[3])
                              ,dollarsToDouble(tokens[2]));
     listOfServices.add(s);
    }
    return listOfServices;
  }

  public static double dollarsToDouble(String dollars)
  {
    String result = dollars.substring(1);
    return Double.parseDouble(result);//strip dollar sign do conversion

  }

  public Service(String name, double totalHours, double pricePerHour)
  {
    super(); //happens by default, can remove

    this.name = name;
    this.totalHours = totalHours;
    this.pricePerHour = pricePerHour;
    this.cost = totalHours * pricePerHour;

  }

  public double getTotalHours(){

    return totalHours;
  }

  public double getPricePerHour(){

    return pricePerHour;
  }

  @Override
  public String toString(){
    String result = super.toString(); //call super class toString(item)
    result += " - "  + totalHours + " hours";
    return result;

  }
}
