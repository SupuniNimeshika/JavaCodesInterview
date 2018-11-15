package String.Methods.ReverseString.Palindrome;

/**
 * Created by Supuni Nimeshika on 11/15/2018.
 */
import java.util.Scanner;
public class Iteration {
    public static void main(String[] args) {

        String a,b ="";
        Scanner s= new Scanner(System.in);

        System.out.print("Enter the String you want to check:");
        a= s.nextLine();
        int n =a.length();

        for(int i =n-1 ; i>=0 ; i--){
            b =b+a.charAt(i);
        }

        if(a.equalsIgnoreCase(b)){
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not a PAlindrome");
        }


    }
}
