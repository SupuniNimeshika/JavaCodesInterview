/**
 * Created by Supuni Nimeshika on 10/26/2018.
 * Write a program to calculate HCF of Two given number.
 */
import java.util.Scanner;
public class HCFGivenTwoNumbers {

    public static void main(String[] args)
    {
        int dividend, divisor;
        int remainder, hcf = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number ");
        dividend = s.nextInt();
        System.out.print("Enter the second number ");
        divisor = s.nextInt();

        do
        {
            remainder = dividend % divisor;
            if(remainder == 0)
            {
                hcf = divisor;
            }
            else
            {
                dividend = divisor;
                divisor = remainder;
            }
        }while(remainder != 0);
        System.out.println("HCF: " + hcf);
    }
}
