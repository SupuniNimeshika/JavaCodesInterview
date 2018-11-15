package String;

/**
 * Created by Supuni Nimeshika on 11/15/2018.
 */
public class tOGGLEeachWord {
    public String toggle(String str){
        String words[]=str.split("\\s");
        String toggle="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";
        }
        return toggle.trim();
    }

    public static void main(String[] args) {
        tOGGLEeachWord tw= new tOGGLEeachWord();
        System.out.print(tw.toggle("I am Supuni Nimeshika"));
    }
}
