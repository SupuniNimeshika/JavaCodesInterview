/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To find the factorial of any number in Java Programming, you have to ask to the user to enter the number, now
 find the factorial of the entered number using for loop and display the factorial result of the given number on the
 output screen as shown in the following program.
 */
import java.util.Scanner;

public class FactorialofaNumber {

    public static void main(String args[])
    {
        int num, i, fact=1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        num = scan.nextInt();

        for(i=num; i>0; i‐‐){
            fact = fact*i;
        }
        System.out.print("Factorial of " + num + " is " + fact);
    }
}
