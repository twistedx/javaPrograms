import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathCallback implements ActionListener {

  private JTextField num1;
  private JTextField num2;

  public MathCallback(JTextField num1, JTextField num2){
      this.num1 = num1;
      this.num2 = num2;
}

  public void actionPerformed(ActionEvent e) {

    try {
    double x = Double.parseDouble(num1.getText());
    double y = Double.parseDouble(num2.getText());

    double sum = x + y;

    JOptionPane.showMessageDialog(num1, "Sum: " + sum);
  }
  catch (NumberFormatException event){
      JOptionPane.showMessageDialog(num1, "That's not a number!");
    }

  }
}

