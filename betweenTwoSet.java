import java.util.*;
public class betweenTwoSet {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2,4));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(16,32,96));
        getTotalX(a,b);
    }
    public static List getTotalX(List<Integer> a, List<Integer> b) {
        int total = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < a.size(); j++) {
                if (i % a.get(j) == 0) {
                    count++;
                }
            }
            if (count == a.size()) {
                list.add(i);
            }
        }
        for(int result:list){
            System.out.println(result);
        }
        return list;
    }
}
