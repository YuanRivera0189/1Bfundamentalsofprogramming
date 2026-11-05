import javax.swing.JOptionPane;

public class AssignmentNumber3Looping_Joptionpane {
    public static void main(String[] args) {
        double balance = 20000.00;

        while (true) {
            String input = JOptionPane.showInputDialog("Current Balance: P" + balance + "\nEnter amount (0 to exit):");
            if (input == null) {
                break;
            }

            double amount = Double.parseDouble(input);

            if (amount == 0) {
                JOptionPane.showMessageDialog(null, "Program terminated. Final Balance: P" + balance);
                break;
            }
            else if (amount > 0) {
                balance += amount;
                JOptionPane.showMessageDialog(null, "Outstanding Balance: P" + balance);
            }
            else {
                double withdrawalAmount = -amount;

                if (balance >= withdrawalAmount) {
                    balance -= withdrawalAmount;
                    JOptionPane.showMessageDialog(null, "Outstanding Balance: P" + balance);
                } else {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
                }
            }
        }
    }
}