/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To check whether the input year is a leap year or not a leap year in Java Programming, you have to ask to the
 user to enter the year and start checking for the leap year.
 */

import java.util.Scanner;

public class CheckLeapYearorNot {

    public static void main(String args[])
    {
        int yr;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year : ");
        yr = scan.nextInt();
        if((yr%4 == 0) && (yr%100!=0))
        {
            System.out.print("This is a Leap Year");
        }
        else if(yr%100 == 0)
        {
            System.out.print("This is not a Leap Year");
        }
        else if(yr%400 == 0)
        {
            System.out.print("This is a Leap Year");
        }
        else
        {
            System.out.print("This is not a Leap Year");
        }
    }

}
