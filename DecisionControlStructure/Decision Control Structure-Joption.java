import javax.swing.JOptionPane;

public class Joption {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a year:", "Leap Year Checker", JOptionPane.QUESTION_MESSAGE);
        if (input != null && !input.trim().isEmpty()) {
            int year = Integer.parseInt(input);
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            String msg = isLeapYear ? year + " is a leap year." : year + " is not a leap year.";
            JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}