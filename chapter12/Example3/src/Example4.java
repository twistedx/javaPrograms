import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example4 extends JFrame {

  private JTextArea area;
  private JRadioButton agree, disagree;
  private JButton next;

  public Example4(){

    setTitle("Do you agree?");
    setSize(800,600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    buildPanel();
    buildMenu();
    setVisible(true);
  }

  public void buildMenu(){
    JMenuBar bar = new JMenuBar();

    JMenu file = new JMenu("File");
    JMenuItem exit = new JMenuItem("Exit");

    file.add(exit);
    bar.add(file);

    add(bar, BorderLayout.NORTH);

    exit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    }
    );
  }
      public void buildPanel() {
        area = new JTextArea();
        agree = new JRadioButton("Agree");
        disagree = new JRadioButton("Disagree", true);
        next = new JButton("Next");

        add(area);

        JPanel south = new JPanel();
        south.add(agree);
        south.add(disagree);
        south.add(next);

        ButtonGroup bg = new ButtonGroup();
        bg.add(agree);
        bg.add(disagree);
        area.setEditable(false);

        next.setEnabled(false);//disable the button
        ToggleListener tl = new ToggleListener(next, agree, disagree);
        agree.addItemListener(tl);
        disagree.addItemListener(tl);

        add(south, BorderLayout.SOUTH);
        area.setLineWrap(true);
        fillTextArea();

      }

      public void fillTextArea() {
        File f = new File("eula.txt");
        try (Scanner inputFile = new Scanner(f)) {
          while (inputFile.hasNextLine()) {
            String line = inputFile.nextLine();
            area.append(line + "\n");
          }
          inputFile.close();
        } catch (FileNotFoundException e) {
          JOptionPane.showInputDialog(e.getMessage());
        }

      }


      public static void main(String[] args) {
        new Example4();
      }

    }