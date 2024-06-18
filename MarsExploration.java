import java.util.*;
public class MarsExploration {
    public static void main(String[] args) {
        String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
        marsExploration(s);
    }
    public static int marsExploration(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i+=3){
            if(s.charAt(i)!='S'){
                count++;
            }
            if(s.charAt(i+1)!='O'){
                count++;
            }
            if(s.charAt(i+2)!='S'){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
