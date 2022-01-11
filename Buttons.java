import java.awt.*;
import javax.swing.*;


public class Buttons extends JFrame {
    JButton red = new JButton("click for red");
    JButton green = new JButton("click for green");
    JButton blue = new JButton("click for blue");
    JButton gray = new JButton("click for gray");
    JButton random = new JButton("click for random");

    Buttons() {
        setTitle("Four Buttons plus Random");
        setPreferredSize(new Dimension(450, 200));
        setLayout(new FlowLayout());
        red.addActionListener(ae -> getContentPane().setBackground(red.getBackground()));
        green.addActionListener(ae -> getContentPane().setBackground(green.getBackground()));
        blue.addActionListener(ae -> getContentPane().setBackground(blue.getBackground()));
        gray.addActionListener(ae -> getContentPane().setBackground(gray.getBackground()));
        random.addActionListener(ae -> getContentPane().setBackground(new Color((int)(Math.random() * 0x1000000))));

        red.setBackground(Color.red);
        green.setBackground(Color.green);
        blue.setBackground(Color.blue);
        gray.setBackground(Color.gray);
        random.setBackground(Color.white);

        add(red);
        add(green);
        add(blue);
        add(gray);
        add(random);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);
        setLocationRelativeTo(null);
        pack();
    }

    public static void main(String[] args){
        Buttons r = new Buttons();
    }
}
