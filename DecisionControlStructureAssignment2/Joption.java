import javax.swing.JOptionPane;

public class Joption {
    public static void main(String[] args) {

        String rateInput = JOptionPane.showInputDialog("Enter Hourly Pay Rate:");
        double payRate = Double.parseDouble(rateInput);

        String hoursInput = JOptionPane.showInputDialog("Enter The Hours Worked:");
        double hoursWorked = Double.parseDouble(hoursInput);

        double grossPay = hoursWorked * payRate;

        double taxRate;
        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }
        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        String result = "Gross Pay: Php " + grossPay +
                "\nWithholding Tax: Php " + withholdingTax +
                "\nNet Pay: Php " + netPay;

        JOptionPane.showMessageDialog(null, result);
    }
}
