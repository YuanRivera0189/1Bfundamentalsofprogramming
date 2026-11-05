import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AssignmentNumber1Looping_BufferedReader {
    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int highest = 0;
        int lowest = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            int num = Integer.parseInt(reader.readLine());

            if (i == 1) {
                highest = num;
                lowest = num;
            } else {
                if (num > highest) {
                    highest = num;
                }
                if (num < lowest) {
                    lowest = num;
                }
            }
        }

        System.out.println("Highest Number: " + highest);
        System.out.println("Lowest Number: " + lowest);
    }
}