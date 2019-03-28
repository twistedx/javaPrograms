import javax.swing.*;
import java.awt.*;

public class FlamingBay extends JFrame {

    private JButton eggN, spag, ramen, beef, chicken, pork, kung, teri, curry;// declare multiple varibles by using coma Decleration not initialization
    private JButton clear, checkout;
    private JTextArea area;


    public FlamingBay() {
        setTitle("Flaming Bay");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildPanel();
        setVisible(true);
    }

    public void buildPanel() {

        BorderLayout layout = new BorderLayout(0, 3);
        setLayout(layout);
        eggN = new JButton("Egg Noodles $1.00");
        spag = new JButton("Spaghetti $0.95");
        ramen = new JButton("Ramen $0.50");
        beef = new JButton("Beef $2.00");
        chicken = new JButton("Chicken $1.50");
        pork = new JButton("Pork $1.25");
        kung = new JButton("Kung Pao $0.50");
        teri = new JButton("Teriyaki $0.25");
        curry = new JButton("Curry $0.45");
        clear = new JButton("Clear");
        checkout = new JButton("Check Out");
        area = new JTextArea(0, 15);

        FBCallBack listener = new FBCallBack(area);
        eggN.addActionListener(listener);
        spag.addActionListener(listener);
        ramen.addActionListener(listener);
        beef.addActionListener(listener);
        chicken.addActionListener(listener);
        pork.addActionListener(listener);
        kung.addActionListener(listener);
        teri.addActionListener(listener);
        curry.addActionListener(listener);
        clear.addActionListener(listener);
        checkout.addActionListener(listener);

        JPanel panel = new JPanel();
        GridLayout grid = new GridLayout(3, 3);
        panel.setLayout(grid);// no longer use flow layout
        panel.add(eggN);
        panel.add(spag);
        panel.add(ramen);
        panel.add(beef);
        panel.add(chicken);
        panel.add(pork);
        panel.add(kung);
        panel.add(teri);
        panel.add(curry);
        add(panel);
        add(area, BorderLayout.EAST);
        add(clear, BorderLayout.NORTH);
        add(checkout, BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        new FlamingBay();
    }

}


