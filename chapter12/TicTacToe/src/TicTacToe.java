import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {

   private JButton[] buttons = new JButton[9];
   ImageIcon temp = new ImageIcon();

    public TicTacToe(){

        setTitle("TicTacToe");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildPanel();
        buildMenu();
        setVisible(true);
    }

    public void buildPanel(){
        GridLayout grid = new GridLayout(3, 3);
        TicListen listen = new TicListen(buttons, temp);
        JPanel panel = new JPanel();
        int i;

        for (i = 0; i < 9; i++) {
            JButton button = new JButton();
              button.setText("");
              button.addActionListener(listen);
              button.setIcon(temp);
              buttons[i] = (button);
        }
        for (JButton temp : buttons){panel.add(temp);}
        panel.setLayout(grid);
        add(panel);
    }
    public void buildMenu() {
        JMenuBar bar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem exit = new JMenuItem("Exit");

        file.add(exit);
        bar.add(file);

        add(bar, BorderLayout.NORTH);

        exit.addActionListener(e -> System.exit(0)
        );
    }

    public static void main(String[] args){
        new TicTacToe();
    }
}
