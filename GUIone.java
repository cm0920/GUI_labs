import javax.swing.*;

public class GUIone extends JFrame{
    public static void main(String[] args){
        int one = JOptionPane.showConfirmDialog(null, "No Message", "Message Box Example", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if(one == JOptionPane.OK_OPTION){
            int two = JOptionPane.showConfirmDialog(null, "WATCH OUT!!!", "Message Box Example", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if(two == JOptionPane.YES_OPTION){
                int three = JOptionPane.showConfirmDialog(null, "You are wrong.", "Message Box Example", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            }
            else if(two == JOptionPane.NO_OPTION){
                int three = JOptionPane.showConfirmDialog(null, "You are correct.", "Message Box Example", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            }
            else {

            }
        }
        else {

        }
    }
}
