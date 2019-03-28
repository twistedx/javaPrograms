import javax.swing.*;

public class Example2 extends JFrame {

  private JLabel label1;
  private JLabel label2;
  private JTextField input1;
  private JTextField input2;
  private JButton calculate;



  public Example2() {
    setTitle("Adder");
    setSize(400, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    buildPanel();
    setVisible(true);

  }

  public void buildPanel(){
    JPanel panel = new JPanel();
    label1 = new JLabel("Enter first number");
    label2 = new JLabel("Enter second number");
    input1 = new JTextField(30);
    input2 = new JTextField(30);
    calculate = new JButton("Calculate!");


    panel.add(label1);
    panel.add(input1);
    panel.add(label2);
    panel.add(input2);
    panel.add(calculate);

    add(panel);

    MathCallback callback = new MathCallback(input1, input2);
    calculate.addActionListener(callback);
  }




  public static void main(String[] args) {
     new Example2();
  }

}
