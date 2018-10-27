/**
 * Created by Supuni Nimeshika on 10/27/2018.
 * To check whether the entered character is an alphabet or not an alphabet in Java Programming, you have to
 ask to the user to enter a character and start checking for alphabet. If the character is in between a to z(will be
 alphabet) or A to Z(will also be alphabet) otherwise it will not be an alphabet.
 */
import java.util.Scanner;

public class CheckAlphabet {

    public static void main(String args[])
    {
        char ch;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        ch = scan.next().charAt(0);

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
    }
}
