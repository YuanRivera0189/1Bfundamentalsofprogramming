import java.util.Scanner;
import java.util.InputMismatchException;

class Bfifthjava {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        try {
            System.out.print("Please enter a year: ");
            int year = inputDevice.nextInt();

            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.println(year + (isLeapYear ? " is a leap year." : " is not a leap year."));

        } catch (InputMismatchException e) {
            System.out.println("Error: Year must be a whole number.");
        } finally {
            inputDevice.close();
        }
    }
}