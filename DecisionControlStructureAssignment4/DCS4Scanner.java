import java.util.Scanner;

public class DCS4Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jedi Academy Admission");

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter citizenship code (C = Citizen of Endor, N = Not citizen of Endor): ");
        char citizenship = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter recommendee code (R = Recommendee of Obi-Wan, N = Non recommendee): ");
        char recommendee = scanner.next().toUpperCase().charAt(0);

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

        scanner.close();
    }
}