/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To calculate the area and perimeter of a square and rectangle in Java Programming, you have to ask to the
 user to enter length and breadth of the rectangle and side length of the square and make two variable, one for
 area and one for perimeter for each to perform the mathematical calculation and display the result on the output
 screen.
 */
import java.util.Scanner;

public class CalculateAreaAndPerimeterOfSquareAndRectangle {

    public static void main(String args[])
    {
        int len, bre, peri, area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Length and Breadth of Rectangle : ");
        len = scan.nextInt();
        bre = scan.nextInt();

        area = len*bre;
        peri = (2*len) + (2*bre);

        System.out.print("Area = " +area);
        System.out.print("\nPerimeter = " +peri);
    }
}
