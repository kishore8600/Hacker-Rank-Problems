import java.util.*;
public class TimeConversion {
    public static void main(String[] args) {
        String s = "06:40:03AM";
        timeConversion(s);
    }
    public static String timeConversion(String s) {
        String x = "";
        String y = "";
        for(int i=0;i<2;i++){
            x=x+s.charAt(i);
        }
        for(int i=2;i<s.length()-2;i++){
            y=y+s.charAt(i);
        }
        int x1 = Integer.parseInt(x);
        int x2 = 12;
        int x3=0;
        if(x1<x2){
            x3=x1+x2;
        }else{
            x3=Math.abs(x1-x2);
        }
        String res="";
        if(x3<10){
            res="0"+String.valueOf(x3);
        }else{
            res=String.valueOf(x3);
        }
        String result = res+y;
        System.out.println(result);
        return result;
    }
}

