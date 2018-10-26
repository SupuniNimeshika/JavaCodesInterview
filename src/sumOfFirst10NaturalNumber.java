/**
 * Created by Supuni Nimeshika on 10/26/2018.
 * Write a program to calculate the sum of first 10 natural number.
 */
public class sumOfFirst10NaturalNumber {
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i=1; i<=10; i++)
        {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

}
