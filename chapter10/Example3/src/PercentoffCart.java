public class PercentoffCart extends ShoppingCart
{
  private double beforeDiscountTotal;

  @Override
  public void applySale(){
    beforeDiscountTotal = subtotal; // preserve the original total
    subtotal *= .8;
  }
  public double getTotalBeforeDiscount(){
    return beforeDiscountTotal;
  }
}
