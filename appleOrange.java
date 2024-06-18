import java.util.*;
public class appleOrange {
    public static void main(String[] args) {
        int s=2;
        int t=3;
        int a=1;
        int b=5;
        ArrayList<Integer> apples = new ArrayList<>(Arrays.asList(-2));
        ArrayList<Integer> oranges = new ArrayList<>(Arrays.asList(-1));
        countApplesAndOranges(s,t,a,b,apples,oranges);
    }
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int applecount=0;
        for(int i=0;i<apples.size();i++){
            int x=a+apples.get(i);
            if(x>s && x<t) applecount++;
        }
        int orangecount=0;
        for(int i=0;i<oranges.size();i++){
            int x=b+oranges.get(i);
            if(x>s && x<t) orangecount++;
        }
        System.out.println(applecount);
        System.out.println(orangecount);


    }
}
