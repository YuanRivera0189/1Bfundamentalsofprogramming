import javax.swing.JOptionPane;

public class AssignmentNumber1Looping_Joptionpane {
    public static void main (String[] args){
        int highest = 0;
        int lowest = 0;

        for (int i = 1; i <= 10; i++) {
            String input = JOptionPane.showInputDialog("Enter number " + i + " of 10:");
            if (input == null) {
                return;
            }

            int num = Integer.parseInt(input);

            if (i == 1) {
                highest = num;
                lowest = num;
            } else {
                if (num > highest) {
                    highest = num;
                }
                if (num < lowest) {
                    lowest = num;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Highest Number: " + highest + "\nLowest Number: " + lowest);
    }
}
