import java.sql.SQLOutput;
import java.util.*;
public class verBigSum {
    public static void main(String[] args) {

        ArrayList<Long> Arr = new ArrayList<>();
        Arr.add(1000000001L);
        Arr.add(1000000002L);
        Arr.add(1000000003L);
        Arr.add(1000000004L);
        Arr.add(1000000005L);
        aVeryBigSum(Arr);
    }
    public static long aVeryBigSum(List<Long> Arr) {
        long result=0;
        for(int i=0;i<Arr.size();i++){
            result = result+ Arr.get(i);
        }
        System.out.println(result);
        return result;

    }
}
