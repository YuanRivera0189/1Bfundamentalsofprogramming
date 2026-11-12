import java.util.Arrays; //Ginagamit ito para madaling ma print ang buong listahan ng mga upuan.

public class ArrayCinemaSeatingChart {
    public static void main(String[] args) {     //line 3,4. Kailangan ito sa Java para gumana ang kahit anong code.

        String[][] seats = {
                {"Alice", "Bob", "Charlie"},   //Dito sa tatlong lines 6,7,8. Binuo ang sinehan, dahil 2D array ([][]) ito, para siyang table na may dalawang row.
                {"David", "Emma", "Frank"}
        }; //dito na nag end.

        System.out.println("Second row, third column: " + seats[1][2]);  //!Tandaan!..  Ang bilang ay laging nagsisimula sa 0, hindi sa 1!
                                                                          //Ang Row 1 ([1]) ay ang pangalawang row, /Ang Column 2 ([2]) ay ang pangatlong column
                                                                        //Kaya kapag tiningnan natin ang seats[1][2], si Frank ang nandoon. Ika-print ito ng computer sa screen.

        // Sa line 16 below, binago natin ang upuan ni Bob na nasa Row 0, Column 1 (seats[0][1]) at pinalitan ng salitang "Vacant".
        seats[0][1] = "Vacant";

        // (Para sa print) ang Arrays.deepToString(seats) ang ginagamit para i-print o ipakita ang buong listahan ng mga upuan sa isang linya.
        System.out.println("Updated seating arrangement: " + Arrays.deepToString(seats));
    }
}