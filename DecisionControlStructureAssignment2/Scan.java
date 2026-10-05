import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Hourly Pay Rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter The number of Hours Worked: ");
        double hoursWorked = input.nextDouble();

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

        System.out.println("\n--- THE PAYROLL SUMMARY ---");
        System.out.println("Gross Pay: Php " + grossPay);
        System.out.println("Withholding Tax: Php " + withholdingTax);
        System.out.println("Net Pay: Php " + netPay);

        input.close();
    }
}