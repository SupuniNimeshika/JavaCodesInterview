/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To calculate average and percentage marks of a students, you have to ask to the user to enter marks obtained in
 some subjects (say 5). Place summation of 5 subject's marks in a variable say sum and place sum/5 in a variable
 say avg then place sum/500*100 in a variable say perc, then display the result on the output screen.
 */
import java.util.Scanner;

public class AverageAndPercentageMarks {
    public static void main(String args[])
    {
        int mark[] = new int[5];
        int i;
        float sum=0;
        float avg, perc;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter marks Obtained in 5 Subjects : ");
        for(i=0; i<5; i++)
        {
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
        }
        avg = sum/5;
        perc = (sum/500) * 100;
        System.out.print("Average Marks = " +avg);
        System.out.print("\nPercentage = " +perc+ "%");
    }
}
