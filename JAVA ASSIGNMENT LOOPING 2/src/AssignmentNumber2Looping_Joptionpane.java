import javax.swing.JOptionPane;

public class AssignmentNumber2Looping_Joptionpane {
    public static void main (String[] args){
        StringBuilder result = new StringBuilder();

        for (int i = 2; i <= 100; i += 2) {
            result.append(i).append(" ");

            if (i % 20 == 0) {
                result.append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, result.toString());
    }
}