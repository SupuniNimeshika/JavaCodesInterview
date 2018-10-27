/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To reverse a number in Java Programming, you have to ask to the user to enter the number. Start reversing the
 number, first make a variable rev and place 0 to rev initially, and make one more variable say rem. Now place
 the modulus of the number to rem and place rev*10+rem to the variable rev, now divide the number with 10
 and continue until the number will become 0.
 */
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String args[])
    {
        int num, rev=0, rem;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
        while(num != 0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.print("Reverse = " +rev);
    }
}
