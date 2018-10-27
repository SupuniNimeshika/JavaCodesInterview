/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To count the number of positive number, negative number, and zero from the given set of numbers entered by
 the user, you have to first ask to the user to enter a set of numbers (10 numbers here) to check all the number
 using for loop to count how many positive, negative, and zero present in the provided set of numbers and
 display the output on the screen as shown in the following program.
 */
import java.util.Scanner;

public class CountPositiveNegativeandZero {

    public static void main(String args[])
    {
        int countp=0, countn=0, countz=0, i;
        int arr[] = new int[10];

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 10 Numbers : ");
        for(i=0; i<10; i++)
        {
            arr[i] = scan.nextInt();
        }
        for(i=0; i<10; i++)
        {
            if(arr[i] < 0)
            {
                countn++;
            }
            else if(arr[i] == 0)
            {
                countz++;
            }
            else
            {
                countp++;
            }
        }
        System.out.print(countp + " Positive Numbers");
        System.out.print("\n" + countn + " Negative Numbers");
        System.out.print("\n" + countz + " Zero");
    }
}
