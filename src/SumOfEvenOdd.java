/**
 * Created by Supuni Nimeshika on 10/26/2018.
 * Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
 */
import java.util.Scanner;

public class SumOfEvenOdd {

    public static void main(String[] args)
    {
        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        Scanner s = new Scanner(System.in);

        do
        {
            System.out.print("Enter the number ");
            number = s.nextInt();

            if( number % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = s.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
