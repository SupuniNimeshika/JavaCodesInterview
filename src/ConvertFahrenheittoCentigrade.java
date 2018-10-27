/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To convert Fahrenheit to centigrade in Java programming, you have to ask to the user to enter the temperature
 in Fahrenheit temperature to convert it into centigrade to display the equivalent temperature value in centigrade
 as shown in the following program.
 */
import java.util.Scanner;

public class ConvertFahrenheittoCentigrade {

    public static void main(String args[])
    {
        float fah;
        double cel;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit : ");
        fah = scan.nextFloat();
        cel = (fah‐32) / 1.8;
        System.out.print("Equivalent Temperature in Celsius = " + cel);
    }
}
