import java.util.*;
public class kaprekarNumbers {
    public static void main(String[] args) {
        int p=1;
        int q=10;
        kaprekarNumbers(p,q);
    }
    public static void kaprekarNumbers(int p, int q) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=p;i<=q;i++){
            int squr = i*i;

            if(squr==i){
                res.add(i);
            }
        }
        System.out.print(res);
    }
}
