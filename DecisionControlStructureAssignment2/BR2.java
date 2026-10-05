import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BR2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter The Hourly Pay Rate: ");
        double payRate = Double.parseDouble(reader.readLine());

        System.out.print("Enter The Hours worked: ");
        double hoursworked = Double.parseDouble(reader.readLine());

        double grossPay = hoursworked * payRate;

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

        System.out.println("\n--- PAYROLL SUMMARY ---");
        System.out.println("Gross Pay: Php " + grossPay);
        System.out.println("Withholding Tax: Php " + withholdingTax);
        System.out.println("Net Pay: Php " + netPay);
    }
}