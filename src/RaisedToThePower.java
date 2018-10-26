/**
 * Created by Supuni Nimeshika on 10/26/2018.
 *
 Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the
 power of another. (Do not use Java builtin
 method)
 */
import java.util.Scanner;

public class RaisedToThePower {
    public static void main(String[] args)
    {
        int base;
        int power;
        int result = 1;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the base number ");
        base = s.nextInt();

        System.out.print("Enter the power ");
        power = s.nextInt();

        for(int i = 1; i <= power; i++)
        {
            result *= base;
        }
        System.out.println("Result: "+ result);
    }
}
