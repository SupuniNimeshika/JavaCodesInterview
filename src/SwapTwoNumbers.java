/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To swap two numbers in Java Programming, you have to first ask to the user to enter the two number, make a
 swap variable of the same type. Now place the first number in the variable swap, then place second number in
 the first, and then place swap in the second.
 */
import java.util.Scanner;
public class SwapTwoNumbers {

    public static void main(String args[])
    {
        int num1, num2, swap;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Two Number : ");
        System.out.print("\nFirst Number : ");
        num1 = scan.nextInt();
        System.out.print("Second Number : ");
        num2 = scan.nextInt();
        swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.print("The Value of the First and Second Number after Swapping is \n");
        System.out.print("First Number = " +num1);
        System.out.print("\nSecond Number = " +num2);
    }
}
