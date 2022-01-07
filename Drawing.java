import java.awt.*;
import javax.swing.*;

public class Drawing extends JFrame {

    public Drawing() {
        setTitle("Four Corners");
        setSize(new Dimension(300, 300));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new DrawingPanel());

        //centers the frame
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) (.5 * (screensize.width - getWidth())), (int) (.5 * (screensize.height - getHeight())), getWidth(), getHeight());
    }

    public static void main(String[] args) {
        new Drawing();
    }

    private class DrawingPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int w = getWidth();
            int h = getHeight();
            int hSteps = h / 15;// update
            int wSteps = w / 15;// update


            // your code goes here
            for(int i = 0; i <= 15 ; i++){
                g.drawLine(0, 0, wSteps * i, h - hSteps * i );
                g.drawLine(w, h, wSteps * i, h - hSteps * i );
                g.drawLine(w, 0, wSteps * i, hSteps * i );
                g.drawLine(0, h, wSteps * i, hSteps * i );
            }
        }
    }

}
