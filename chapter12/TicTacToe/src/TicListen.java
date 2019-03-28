import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicListen implements ActionListener {
    ImageIcon x = new ImageIcon("x.jpg") ;
    ImageIcon o = new ImageIcon("o.jpg");
    private boolean gameOver = false;
    private JButton[] buttons;
    private int counter = 0;
    private ImageIcon image;

    public TicListen(JButton[] buttons, ImageIcon temp) {
        this.buttons = buttons;
        this.image = temp;
    }

    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();
        if (button.getIcon().equals(image)) {
            if (counter == 8){JOptionPane.showMessageDialog(null, "Tie!");  System.exit(0);}
            if (counter % 2 == 0) {
                counter++;
                button.setIcon(x);
                checkWin();
            } else {
                button.setIcon(o);
                counter++;
                checkWin();
            }
        }
    }

    public void checkWin() {
        int i;

        for (i = 0; i < buttons.length; i++) {
            //horizontal checks
            if (buttons[i] == null) {System.out.println("null");}
            if (buttons[0].getIcon().equals(x) && buttons[1].getIcon().equals(x) && buttons[2].getIcon().equals(x)) {
                JOptionPane.showMessageDialog(null, "Winner: X");  i = buttons.length; gameOver = true;
            } else if (buttons[0].getIcon().equals(o) && buttons[1].getIcon().equals(o) && buttons[2].getIcon().equals(o)) {
                JOptionPane.showMessageDialog(null, "Winner: O");  i = buttons.length; gameOver = true;
            } else if (buttons[3].getIcon().equals(x) && buttons[4].getIcon().equals(x) && buttons[5].getIcon().equals(x)) {
                JOptionPane.showMessageDialog(null, "Winner: X");  i = buttons.length; gameOver = true;
            } else if (buttons[3].getIcon().equals(o) && buttons[4].getIcon().equals(o) && buttons[5].getIcon().equals(o)) {
                JOptionPane.showMessageDialog(null, "Winner: O");  i = buttons.length; gameOver = true;
            } else if (buttons[6].getIcon().equals(x) && buttons[7].getIcon().equals(x) && buttons[8].getIcon().equals(x)) {
                JOptionPane.showMessageDialog(null, "Winner: X");  i = buttons.length; gameOver = true;
            } else if (buttons[6].getIcon().equals(o) && buttons[7].getIcon().equals(o) && buttons[8].getIcon().equals(o)) {
                JOptionPane.showMessageDialog(null, "Winner: O");  i = buttons.length; gameOver = true;
                // vertical checks
            } else if (buttons[0].getIcon().equals(x) && buttons[3].getIcon().equals(x) && buttons[6].getIcon().equals(x)) {
                JOptionPane.showMessageDialog(null, "Winner: X");  i = buttons.length; gameOver = true;
            } else if (buttons[0].getIcon().equals(o) && buttons[3].getIcon().equals(o) && buttons[6].getIcon().equals(o)) {
                JOptionPane.showMessageDialog(null, "Winner: O"); i = buttons.length; gameOver = true;
            } else if (buttons[1].getIcon().equals(x) && buttons[4].getIcon().equals(x) && buttons[7].getIcon().equals(x)) {
                JOptionPane.showMessageDialog(null, "Winner: X"); i = buttons.length; gameOver = true;
            } else if (buttons[1].getIcon().equals(o) && buttons[4].getIcon().equals(o) && buttons[7].getIcon().equals(o)) {
                JOptionPane.showMessageDialog(null, "Winner: O"); i = buttons.length; gameOver = true;
            } else if (buttons[2].getIcon().equals(x) && buttons[5].getIcon().equals(x) && buttons[8].getIcon().equals(x)) {
                JOptionPane.showMessageDialog(null, "Winner: X"); i = buttons.length; gameOver = true;
            } else if (buttons[2].getIcon().equals(o) && buttons[5].getIcon().equals(o) && buttons[8].getIcon().equals(o)) {
                JOptionPane.showMessageDialog(null, "Winner: O"); i = buttons.length; gameOver = true;
                //Diagonal checks
            } else if (buttons[0].getIcon().equals(x) && buttons[4].getIcon().equals(x) && buttons[8].getIcon().equals(x)) {
                JOptionPane.showMessageDialog(null, "Winner: X"); i = buttons.length; gameOver = true;
            } else if (buttons[0].getIcon().equals(o) && buttons[4].getIcon().equals(o) && buttons[8].getIcon().equals(o)) {
                JOptionPane.showMessageDialog(null, "Winner: O"); i = buttons.length; gameOver = true;
            } else if (buttons[2].getIcon().equals(x) && buttons[4].getIcon().equals(x) && buttons[6].getIcon().equals(x)) {
                JOptionPane.showMessageDialog(null, "Winner: X"); i = buttons.length; gameOver = true;
            } else if (buttons[2].getIcon().equals(o) && buttons[4].getIcon().equals(o) && buttons[6].getIcon().equals(o)) {
                JOptionPane.showMessageDialog(null, "Winner: O"); i = buttons.length; gameOver = true;
            }
        }
        if (gameOver)
        System.exit(0);
    }
}
