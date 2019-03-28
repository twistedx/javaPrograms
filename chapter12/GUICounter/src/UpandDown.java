import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UpandDown extends JFrame {
  private int count = 1;
  private JPanel panel;
  private JLabel label;
  private JButton up;
  private JButton down;
  private JLabel text1;
  private JLabel text2;


  public UpandDown() {

    setTitle("Up and Down");
    setSize(300, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    buildPanel();
    add(panel);
    setVisible(true);
  }

  public void buildPanel() {

    up = new JButton("Up");
    label = new JLabel("1");
    down = new JButton("Down");
    text1 = new JLabel("Click the Up button. Max value is 50.");
    text2 = new JLabel("Click the Down Button. Min Value is 1.");


    panel = new JPanel();
    panel.add(up);
    panel.add(label);
    panel.add(down);
    panel.add(text1);
    panel.add(text2);


    up.addActionListener(new UpCallback());
    down.addActionListener(new DownCallback());
  }

  public class UpCallback implements ActionListener {


    public void actionPerformed(ActionEvent e) {

      if (count < 50) {
        count++;
        label.setText("" + count);
      } else {
        label.setText("" + count);
      }
    }
  }

  public class DownCallback implements ActionListener {


    public void actionPerformed(ActionEvent e) {

      if (count > 1) {
        count--;
        label.setText("" + count);
      } else {
        label.setText("" + count);
      }
    }
  }

  public static void main(String[] args) {
    new UpandDown();
  }
}

