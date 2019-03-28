import java.util.ArrayList;

public class OrderItems {
    private static String ret;
    static private ArrayList order = new ArrayList();
   static private double total;
    static int counter = 0;

    public static void addOrder(String name) {order.add(name);}

    public static String printOut() { return order.get(counter++).toString() + "\n";}

    public static String sum() {
        for (int i = 0; i < order.size(); i++) {
            String temp = order.get(i).toString();
           String[] sumMe = temp.split("\\$");
           System.out.println(sumMe.length);
           String temp3 = sumMe[1];
            double d = Double.parseDouble(temp3);
            total += d;
          ret =  String.format("---Cost: $%.2f \n", total);
        } return ret;
    }
    public static void clearList(){order.clear(); total=0; counter = 0;}
}
