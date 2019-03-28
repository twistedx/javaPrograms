import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuItem implements ActionListener {

  private static double total = 0;  //variable is shared amongst all menu items
  private JTextArea area;
  private String productName;
  private double price;

  public MenuItem(JTextArea area, String productName, double price){
    this.area= area;
    this.productName = productName;
    this.price = price;

  }

  public void actionPerformed(ActionEvent e) {
    total += price;
    String niceNumber = String.format("%.2f", total);
    area.append("\n" + productName);
    area.append("\n Total: $" + niceNumber);
  }
}
