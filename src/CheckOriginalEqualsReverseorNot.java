/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To check whether the original number is equal to its reverse or not in Java programming, you have to ask to the
 user to enter the number and reverse that number then check that reverse is equal to the original or not, before
 reversing the number make a variable of the same type and place the value of the original number to that
 variable to check after reversing the number.
 */
import java.util.Scanner;

public class CheckOriginalEqualsReverseorNot {

    public static void main(String args[])
    {
        int num, orig, rev=0, rem;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
        orig=num;
        while(num>0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(orig == rev)
        {
            System.out.print("Reverse is Equal to Original");
        }
        else
        {
            System.out.print("Reverse is not Equal to Original");
        }
    }
}
