/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To interchange two numbers in Java Programming, make a variable say temp of the same type, place the first
 number to the temp, then place the second number to the first and place temp to the second.
 */
import java.util.Scanner;

public class InterchangeTwoNumbers {

    public static void main(String args[])
    {
        int a, b, temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Value of A and B :\n");
        System.out.print("A = ");
        a = scan.nextInt();
        System.out.print("B = ");
        b = scan.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.print("Number Interchanged Successfully..!!\n");
        System.out.print("A = " +a);
        System.out.print("\nB = " +b);
    }
}
