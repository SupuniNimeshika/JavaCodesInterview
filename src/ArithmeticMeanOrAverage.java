/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To calculate the arithmetic mean of some numbers in Java Programming, you have to ask to the user to enter
 number size then ask to enter the numbers of that size to perform the addition, then make a variable responsible
 for the average and place addition/size in average, then display the result on the output screen.
 */
import java.util.Scanner;

public class ArithmeticMeanOrAverage {

    public static void main(String args[])
    {
        int n, i, sum=0, armean;
        int arr[] = new int[50];

        Scanner scan = new Scanner(System.in);

        System.out.print("How many Number you want to Enter ? ");
        n = scan.nextInt();

        System.out.print("Enter " +n+ " Numbers : ");
        for(i=0; i<n; i++)
        {
            arr[i] = scan.nextInt();
            sum = sum + arr[i];
        }
        armean = sum/n;
        System.out.print("Arithmetic Mean = " +armean);
    }
}
