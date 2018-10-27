/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To check whether the input number is an even number or an odd number in Java programming, you have to ask
 to the user to enter the number, now if number is divisible by 2 (it will be even number) and if the number is not
 divisible by 2 (it will be an odd number)
 */
import java.util.Scanner;

public class CheckEvenOrOdd {

    public static void main(String args[])
    {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
        if(num%2 == 0)
        {
            System.out.print("This is an Even Number");
        }
        else
        {
            System.out.print("This is an Odd Number");
        }
    }
}
