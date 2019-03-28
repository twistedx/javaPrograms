public class Item {
  // Super class of product and service
  // name() - cost()
  //going to extend name and cost from product and service
  //products has a price()
  //service has totalHours() & pricePerHour()
  // get name get price tostring()

  protected String name; // subclassess can see this field
  protected double cost;

  public Item()
  {
    name = "(no name )";
    cost = -1;

  }
  public Item(String name, double cost){
    this.name = name;
    this.cost = cost;

  }

  public String getName(){
    return name;
  }
  public double getTotalCost(){
    return cost;
  }


public String toString(){

    return name + " $" + cost;

}



}
