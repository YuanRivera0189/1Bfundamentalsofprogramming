import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AssignmentNumber3Looping_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double balance = 20000.00;

        System.out.println("Initial Balance: P20,000.00");

        while (true) {
            System.out.print("Enter amount: ");
            double amount = Double.parseDouble(reader.readLine());

            if (amount == 0) {
                System.out.println("Program terminated. Final Balance: P" + balance);
                break;
            }
            else if (amount > 0) {
                balance += amount;
                System.out.println("Outstanding Balance: P" + balance);
            }
            else {
                double withdrawalAmount = -amount;

                if (balance >= withdrawalAmount) {
                    balance -= withdrawalAmount;
                    System.out.println("Outstanding Balance: P" + balance);
                } else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }
        }
    }
}