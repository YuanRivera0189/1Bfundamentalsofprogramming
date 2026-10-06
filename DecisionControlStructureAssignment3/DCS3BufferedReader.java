import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DCS3BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Your NSAT Score: ");
        double nsat = Double.parseDouble(reader.readLine());

        System.out.print("Enter Your Parents Salary: ");
        double salary = Double.parseDouble(reader.readLine());

        System.out.print("Enter Your Entrance Exam Score: ");
        double exam = Double.parseDouble(reader.readLine());

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