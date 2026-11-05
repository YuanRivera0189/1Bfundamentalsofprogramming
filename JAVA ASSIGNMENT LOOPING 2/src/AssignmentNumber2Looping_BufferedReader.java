public class AssignmentNumber2Looping_BufferedReader {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + "\t");

            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}