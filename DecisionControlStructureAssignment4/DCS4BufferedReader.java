import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DCS4BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Jedi Academy Admission");

        System.out.print("Enter height: ");
        double height = Double.parseDouble(reader.readLine());

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());

        System.out.print("Enter your citizenship code (C = Citizen of Endor, N = Non-citizen): ");
        char citizenship = reader.readLine().toUpperCase().charAt(0);

        System.out.print("Enter the recommendee code (R = Recommendee of Obi-Wan, N = Non-recommendee): ");
        char recommendee = reader.readLine().toUpperCase().charAt(0);

        boolean isAccepted;

        if (recommendee == 'R') {
            isAccepted = true;
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
            isAccepted = true;
        } else {
            isAccepted = false;
        }
        if (isAccepted) {
            System.out.println("Result: ACCEPTED to the Jedi Knight Military Academy!");
        } else {
            System.out.println("Result: REJECTED from the Jedi Knight Military Academy.");
        }
    }
}
