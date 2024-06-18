import java.util.*;
public class HackerRankString {
    public static void main(String[] args) {
        String s="hrhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        hackerrankInString(s);
    }
    public static String hackerrankInString(String s) {
        String x = "hackerrank";
        int index=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==x.charAt(index)){
                index++;
                if(index==x.length()){
                    System.out.println("YES");
                    return "YES";
                }
            }
        }
        System.out.println("NO");
        return "NO";
    }
}
