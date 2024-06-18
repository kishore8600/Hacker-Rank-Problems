import java.util.*;
public class appendDeete {
    public static void main(String[] args) {
        String s = "hackerhappy";
        String t = "hackerrank";
        int k=9;
        appendAndDelete(s,t,k);
    }
    public static String appendAndDelete(String s, String t, int k) {
        StringBuilder S = new StringBuilder(s);
        StringBuilder T = new StringBuilder(t);
        StringBuilder X = new StringBuilder();
        int i=1;
        int x=0;
        while(i==1){
            if(s.charAt(x)==t.charAt(x)){
                X.append(s.charAt(x));
                x++;
            }else{
                i=0;
            }
        }
        int sval=S.length()-X.length();
        int tval=T.length()-X.length();
        int val=Math.abs(sval+tval);
        if(val==k){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}
