import java.util.*;
public class compareTriplets {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        System.out.println(a);
        b.add(3);
        b.add(6);
        b.add(10);
        System.out.println(b);
        compareTriplets(a,b);
    }
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        int countA=0;
        int countB=0;

        for(int i=0;i<a.size();i++){
            for(int j=i;j<=i;j++){
                if(a.get(i)>b.get(j)){
                    countA++;
                }else if(a.get(i) < b.get(j)){
                    countB++;
                }
            }
        }
        result.add(countA);
        result.add(countB);
        System.out.println(result);
        return result;
    }
}
