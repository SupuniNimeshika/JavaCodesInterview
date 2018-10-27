/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To check whether the input alphabet is a vowel or not in Java Programming, you have to ask to the user to enter
 a character (alphabet) and check if the entered character is equal to a, A, e, E, i, I, o, O, u, U. If it is equal to any
 one of the 10, then it will be vowel otherwise it will not be a vowel.
 */
import java.util.Scanner;

public class CheckVowelorNot {

    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Alphabet : ");
        ch = scan.next().charAt(0);
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
                ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
                ch=='u' || ch=='U')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("This is not a Vowel");
        }
    }
}
