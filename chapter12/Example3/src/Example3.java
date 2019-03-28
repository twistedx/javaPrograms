import javax.swing.*;
import java.awt.*;

public class Example3 extends JFrame {

  private JButton burger, fries, soda; // declare multiple varibles by using coma Decleration not initialization
  private JTextArea area;



  public Example3(){
    setTitle("Test");
    setSize(500, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    buildPanel();
    setVisible(true);

  }

  public void buildPanel(){

  burger = new JButton("Burger $1");
  fries = new JButton("fries $2");
  soda = new JButton("Soda $3");

  area = new JTextArea("-----------Order Console-----------\n");


  add(area, BorderLayout.EAST);

  JPanel panel = new JPanel();
  GridLayout grid = new GridLayout(3 , 1);
  panel.setLayout(grid);// no longer use flow layout


  panel.add(burger);
  panel.add(fries);
  panel.add(soda);


  add(panel);
  MenuItem foodListener = new MenuItem(area, "Burger", 1);
  burger.addActionListener(foodListener);

  MenuItem foodListener2 = new MenuItem(area, "Fries", 2);
  fries.addActionListener(foodListener2);

  MenuItem foodListener3 = new MenuItem(area, "Soda", 3);
  soda.addActionListener(foodListener3);

  }


  public static void main(String[] args){
    new Example3();
  }

}
