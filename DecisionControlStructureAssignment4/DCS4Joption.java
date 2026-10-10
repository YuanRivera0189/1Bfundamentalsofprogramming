import javax.swing.JOptionPane;

public class DCS4Joption {
    public static void main(String[] args) {
        String heightInput = JOptionPane.showInputDialog(null, "Enter your height (in cm):", "Jedi Academy Admission", JOptionPane.QUESTION_MESSAGE);
        double height = Double.parseDouble(heightInput);

        String ageInput = JOptionPane.showInputDialog(null, "Enter age:", "Jedi Academy Admission", JOptionPane.QUESTION_MESSAGE);
        int age = Integer.parseInt(ageInput);

        String citizenshipInput = JOptionPane.showInputDialog(null, "Enter your citizenship code (C = Citizen of Endor, N = Non-citizen):", "Jedi Academy Admission", JOptionPane.QUESTION_MESSAGE);
        char citizenship = citizenshipInput.toUpperCase().charAt(0);

        String recommendeeInput = JOptionPane.showInputDialog(null, "Enter the recommendee code (R = Recommendee of Obi-Wan, N = Non-recommendee):", "Jedi Academy Admission", JOptionPane.QUESTION_MESSAGE);
        char recommendee = recommendeeInput.toUpperCase().charAt(0);

        boolean isAccepted;

        if (recommendee == 'R') {
            isAccepted = true;
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
            isAccepted = true;
        } else {
            isAccepted = false;
        }
        String resultMessage;
        if (isAccepted) {
            resultMessage = "Congratulations!\nYou are ACCEPTED to the Jedi Knight Military Academy!";
        } else {
            resultMessage = "Sorry.\nYou are REJECTED from the Jedi Knight Military Academy.";
        }
        JOptionPane.showMessageDialog(null, resultMessage, "Admission Result", JOptionPane.INFORMATION_MESSAGE);
    }
}