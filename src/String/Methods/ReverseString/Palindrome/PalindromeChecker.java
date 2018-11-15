package String.Methods.ReverseString.Palindrome;

/**
 * Created by Supuni Nimeshika on 11/15/2018.
 */
public class PalindromeChecker {
    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}
