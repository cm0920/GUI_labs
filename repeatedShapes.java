import java.awt.*;
import javax.swing.*;

public class repeatedShapes extends JFrame {
    public repeatedShapes() {
        setTitle("");
        setSize(new Dimension(300,300));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new DrawingPanel());

        //centers the frame
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) (.5*(screensize.width-getWidth())), (int)(.5*(screensize.height-getHeight())), getWidth(), getHeight() );
    }

    public static void main(String[] args){
        new repeatedShapes();
    }

    private class DrawingPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            JOptionPane.showInputDialog(null, "Enter 1 for rectangles \nEnter 2 for circles", "Input", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
