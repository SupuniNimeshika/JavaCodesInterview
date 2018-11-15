package String.Methods.ReverseString;

/**
 * Created by Supuni Nimeshika on 11/15/2018.
 */
import java.util.Scanner;
public class ReverseIteration {
    public static void main(String[] args) {
        System.out.print("Enter String to Reverse:");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String reverse ="";

        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.print("Reverse String is:"+reverse );
    }
}
