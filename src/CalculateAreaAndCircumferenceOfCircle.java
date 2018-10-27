/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To calculate the area and circumference of any circle in Java Programming, you have to ask to the user to enter
 the radius of the circle and initialize the radius value in the variable say r and make two variable, one to store
 the area of the circle and the other to store the circumference of the circle, and place 3.14*r*r in area and
 2*3.14*r in circumference, then display the result on the output screen.
 */
import java.util.Scanner;

public class CalculateAreaAndCircumferenceOfCircle {

    public static void main(String args[])
    {
        float r;
        double area, circum;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Radius of Circle : ");
        r = scan.nextFloat();

        area = 3.14*r*r;
        circum = 2*3.14*r;
        System.out.print("Area of Circle = " +area);
        System.out.print("\nCircumference of Circle = " +circum);
    }
}
