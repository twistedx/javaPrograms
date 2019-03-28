public abstract class ShoppingCart {

  protected double subtotal = 0;

  public void addProduct(Item p){

    subtotal += p.getTotalCost();
  }
    public double getTotal(){
    applySale(); //calls method that doesnt exist yet
  return subtotal;
}

  protected abstract void applySale();

}
