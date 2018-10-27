/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To find the largest number of/in three numbers in Java Programming, you have to ask to the user to enter the
 three numbers, now start checking which one is the largest number, after finding the largest number, display
 that number as the largest number of the three number on the screen as shown in the following program.
 */
import java.util.Scanner;

public class LargestofThreeNumbers {

    public static void main(String args[])
    {
        int a, b, c, big;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Three Numbers : ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
// let a is the largest
        big = a;
        if(big<b)
        {
            if(b>c)
            {
                big = b;
            }
            else
            {
                big = c;
            }
        }
        else if(big<c)
        {
            if(c>b)
            {
                big = c;
            }
            else
            {
                big = b;
            }
        }
        else
        {
            big = a;
        }
        System.out.print("Largest Number is " +big);
    }
}
