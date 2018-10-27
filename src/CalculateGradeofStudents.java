/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To calculate the grade of a student on the basis of his/her total marks in Java Programming, you have to ask to
 the user to enter the marks obtained in some subjects (5 subjects here), then calculate the percentage and
 start checking for the grades to display the grade on the output screen.
 */
import java.util.Scanner;

public class CalculateGradeofStudents {

    public static void main(String args[])
    {
        int mark[] = new int[5];
        int i;
        float sum=0, avg;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Marks Obtained in 5 Subjects : ");
        for(i=0; i<5; i++)
        {
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
        }
        avg = sum/5;
        System.out.print("Your Grade is ");
        if(avg>80)
        {
            System.out.print("A");
        }
        else if(avg>60 && avg<=80)
        {
            System.out.print("B");
        }
        else if(avg>40 && avg<=60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
