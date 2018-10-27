/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To add n numbers in Java Programming, you have to ask to the user to enter the value of n (how many number
 he/she want to enter ?), then ask to enter n (required amount of) numbers to perform the addition of all the
 numbers and display the addition result on the output screen.
 */
import java.util.Scanner;

public class AddNNumbers {

    public static void main(String args[])
    {
        int i, n, sum=0, num;

        Scanner s = new Scanner(System.in);

        System.out.print("How many Number You want to Enter to Add them ? ");
        n = s.nextInt();

        System.out.print("Enter " +n+ " numbers : ");

        for(i=0; i<n; i++)
        {
            num = s.nextInt();
            sum = sum + num;
        }
        System.out.print("Sum of all " +n+ " numbers is " +sum);
    }
}
