import java.util.*;
public class savePrisoner {
    public static void main(String[] args) {
        int n=4;
        int m=6;
        int s=2;
        saveThePrisoner(n,m,s);
    }
    public static int saveThePrisoner(int n, int m, int s) {
        int last = ((m-1)+s)%n;
        if(last==0){
            last=n;
        }
        System.out.println(last);
        return last;
    }
}
