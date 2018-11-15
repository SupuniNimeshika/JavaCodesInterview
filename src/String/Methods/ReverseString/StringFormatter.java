package String.Methods.ReverseString;

/**
 * Created by Supuni Nimeshika on 11/15/2018.
 */
public class StringFormatter {
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
