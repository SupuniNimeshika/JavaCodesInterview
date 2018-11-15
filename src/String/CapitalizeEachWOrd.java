package String;

/**
 * Created by Supuni Nimeshika on 11/15/2018.
 */
public class CapitalizeEachWOrd {
    public String capitalizeWord(String str){
        String words[] = str.split("\\s");
        String capitalizeWord ="";

        for(String w: words){
            String first = w. substring(0,1);
            String afterFirst = w.substring(1);
            capitalizeWord += first.toUpperCase()+afterFirst+"";
        }
        return capitalizeWord.trim();
    }

    public static void main(String[] args) {
        CapitalizeEachWOrd cw = new CapitalizeEachWOrd();
        System.out.print(cw.capitalizeWord("my name is khan"));
    }
}
