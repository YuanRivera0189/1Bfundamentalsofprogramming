import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class Bsixthjava {
    public static void main (String[] args) {
        String name = "";
        name = JOptionPane.showInputDialog("Please Enter Your Name");

        String msg = "Hello" + name + "!";
        showMessageDialog(null, msg);
    }
}