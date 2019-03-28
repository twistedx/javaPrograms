import javax.swing.*;
import java.awt.*;

public class Example1 extends JFrame {
  private JPanel panel;

  public Example1(){

    setTitle("Click Counter");
    setSize(400, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    buildPanel();
    add(panel);
    setVisible(true);
  }




  public void buildPanel(){
    JButton click = new JButton("Click Me 100 times");
    JLabel label = new JLabel("No Clicks");

    panel = new JPanel();
    panel.add(label);
    panel.add(click);


    panel.setBackground(Color.cyan);
    click.setForeground(Color.LIGHT_GRAY);
    click.setBackground(Color.BLACK);
    click.addActionListener(new ClickCounterCallback(click, panel, label));

  }



  public static void main(String[] args){
    Example1 test = new Example1();
  }
}
