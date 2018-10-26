/**
 * Created by Supuni Nimeshika on 10/26/2018.
 * Write a program that prompts the user to input a positive integer. It should then print the multiplication table of
 that number.
 */
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args)
    {
        int num;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter any positive integer: ");
        num = s.nextInt();

        System.out.println("Multiplication Table of " + num);

        for(int i=1; i<=10; i++)
        {
            System.out.println(num +" x " + i + " = " + (num*i) );
        }
    }
}
