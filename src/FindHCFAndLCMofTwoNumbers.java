/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To find the HCF and LCF of two number in Java Programming, you have to ask to the user to enter the two
 number, to find the HCF and LCF of the given two number to display the value of the HCF and LCM of the two
 numbers on the output screen as shown in the following program.
 */
import java.util.Scanner;

public class FindHCFAndLCMofTwoNumbers {

    public static void main(String args[])
    {
        int a, b, x, y, t, hcf, lcm;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Two Number : ");
        x = scan.nextInt();
        y = scan.nextInt();
        a = x;
        b = y;
        while(b != 0)
        {
            t = b;
            b = a%b;
            a = t;
        }
        hcf = a;
        lcm = (x*y)/hcf;
        System.out.print("HCF = " +hcf);
        System.out.print("\nLCM = " +lcm);
    }
}
