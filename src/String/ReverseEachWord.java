package String;

/**
 * Created by Supuni Nimeshika on 11/15/2018.
 */
public class ReverseEachWord {
    public  String reverseWord(String str){
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }

    public static void main(String[] args) {
        ReverseEachWord rw =new ReverseEachWord();
        System.out.print(rw.reverseWord("My Name is Supuni"));
    }
}

