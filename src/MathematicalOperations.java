/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To perform mathematical operations such as addition, subtraction, multiplication and division of any two number
 in Java Programming, you have to ask to the user to enter the two number and then perform the action
 accordingly.
 */
import java.util.Scanner;

public class MathematicalOperations {
    public static void main(String args[])
    {
        int a, b, res;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Two Numbers : ");
        a = scan.nextInt();
        b = scan.nextInt();
        res = a + b;
        System.out.println("Addition = " +res);
        res = a- b;

        System.out.println("Subtraction = " +res);
        res = a * b;

        System.out.println("Multiplication = " +res);
        res = a / b;
        System.out.println("Division = " +res);
    }
}
