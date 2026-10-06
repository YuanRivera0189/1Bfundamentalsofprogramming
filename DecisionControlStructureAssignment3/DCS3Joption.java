import javax.swing.JOptionPane;

public class DCS3Joption {
    public static void main(String[] args) {
        double nsat = Double.parseDouble(JOptionPane.showInputDialog("Enter Your NSAT Score:"));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter your Parents Salary:"));
        double exam = Double.parseDouble(JOptionPane.showInputDialog("Enter your Entrance Exam Score:"));

        double average = (nsat + exam) / 2;

        String result;
      ;  if (salary > 10000 || nsat < 90 || exam < 85) {
            result = "Rejected";
        } else if (salary <= 3500 && average >= 91) {
            result = "Accepted";
        } else {
            result = "For Further Study";
        }

        JOptionPane.showMessageDialog(null, "Result: " + result);
    }
}