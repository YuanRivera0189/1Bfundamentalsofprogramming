import java.util.Scanner;

public class DCS3Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        double nsat = input.nextDouble();

        System.out.print("Enter parents' salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter entrance exam score: ");
        double exam = input.nextDouble();

        double average = (nsat + exam) / 2;

        if (salary > 10000 || nsat < 90 || exam < 85) {
            System.out.println("Result: Rejected");
        } else if (salary <= 3500 && average >= 91) {
            System.out.println("Result: Accepted");
        } else {
            System.out.println("Result: For Further Study");
        }
    }
}