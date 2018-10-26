/**
 * Created by Supuni Nimeshika on 10/26/2018.
 * Write a program to find the factorial value of any number entered through the keyboard.
 */
import java.util.Scanner;

public class FactorialValue {

    public static void main(String[] args){

        int num; // To hold number
        int fact = 1; // To hold factorial
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any positive integer: ");
        num = s.nextInt();

        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }
    System.out.println("Factorial: "+ fact);
}
}
