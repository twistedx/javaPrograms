import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ClickCounterCallback implements ActionListener {

  private int counter = 0;
  private JButton button;
  private JPanel panel;
  private JLabel label;
  private static Random rng = new Random();


  public ClickCounterCallback(JButton button, JPanel panel, JLabel label){

    this.button = button;
    this.panel = panel;
    this.label = label;
  }


 public void actionPerformed(ActionEvent e) {
   counter++;
   label.setText("Counter: " + counter);

   if (counter >= 25 & counter <= 50){
     Color custom = new Color(rng.nextInt(256),rng.nextInt(256),
                                                        rng.nextInt(256));
     panel.setBackground(custom);
   }


   if (counter == 100) {
      button.setForeground(Color.white);
      button.setBackground(Color.black);
      panel.setBackground(Color.BLUE);
   }
 }



}
