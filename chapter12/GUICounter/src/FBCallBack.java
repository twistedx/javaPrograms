import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FBCallBack implements ActionListener {


    private JTextArea text;


    public FBCallBack(JTextArea text) {this.text = text;}

    public void actionPerformed(ActionEvent e) {

        String action = e.getActionCommand();
        if (action.equals("Egg Noodles $1.00")) {
            OrderItems.addOrder(action);
            text.append(OrderItems.printOut());
        } else if (action.equals("Spaghetti $0.95")) {
            OrderItems.addOrder(action);
            text.append(OrderItems.printOut());
        } else if (action.equals("Ramen $0.50")) {
            OrderItems.addOrder(action);
            text.append(OrderItems.printOut());
        } else if (action.equals("Beef $2.00")) {
            OrderItems.addOrder(action);
            text.append(OrderItems.printOut());
        } else if (action.equals("Chicken $1.50")) {
            OrderItems.addOrder(action);
            text.append(OrderItems.printOut());
        } else if (action.equals("Pork $1.25")) {
            OrderItems.addOrder(action);
            text.append(OrderItems.printOut());
        } else if (action.equals("Kung Pao $0.50")) {
            OrderItems.addOrder(action);
            text.append(OrderItems.printOut());
        } else if (action.equals("Teriyaki $0.25")) {
            OrderItems.addOrder(action);
            text.append(OrderItems.printOut());
        } else if (action.equals("Curry $0.45")) {
            OrderItems.addOrder(action);
            text.append(OrderItems.printOut());
        } else if (action.equals("Clear")) {
            OrderItems.clearList();
            text.setText("");
        } else if (action.equals("Check Out")) {
            text.append(OrderItems.sum());
        }
    }
}
