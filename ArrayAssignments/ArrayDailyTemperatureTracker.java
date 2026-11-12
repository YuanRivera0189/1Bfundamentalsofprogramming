public class ArrayDailyTemperatureTracker {
    public static void main(String[] args) {

        double[] temperatures = new double[5]; //Gumawa ng listahan na kayang maglaman ng 5 decimal numbers. Ginamit ang double dahil may decimal point ang mga numbers.

        temperatures[0] = 32.5;
        temperatures[1] = 34.0;                 //!Tandaan!..  Ang bilang ay laging nagsisimula sa 0, hindi sa 1!
        temperatures[2] = 31.8;                 //Para sa linya 6-10Nilagyan ng laman ang bawat puwesto sa listahan. Nagsisimula ang bilang sa 0 (unang araw) hanggang 4 (ikalimang araw).
        temperatures[3] = 33.2;
        temperatures[4] = 35.1;

        for (int i = 0; i < temperatures.length; i++) {         //Isa-isang binasa at ipinakita sa screen ang lahat ng temperatura mula simula (0) hanggang dulo (.length)
            System.out.println(temperatures[i]);
        }

        temperatures[2] = 32.0; //Binabago nito ang nakalagay na temperatura sa ikatlong araw, bakit ikat long araw? dahil ang bilang ay nagsisimula sa 0.

        System.out.println("Updated Day at 3: " + temperatures[2]); //Dito na ang print, Ipinapakita nito sa screen kung napalitan nga ba talaga ang value.
    }
}