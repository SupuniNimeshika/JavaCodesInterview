/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To add digits of any number in Java Programming, you have to ask to the user to enter the number to add their
 digits and display the summation of digits of that number.
 */
import java.util.Scanner;

public class AddDigitOfNumber {

    public static void main(String args[])
    {
        int num, rem=0, sum=0, temp;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        num = scan.nextInt();

        temp = num;
        while(num>0)
        {
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        System.out.print("Sum of Digits of " +temp+ " is " +sum);
    }
}
