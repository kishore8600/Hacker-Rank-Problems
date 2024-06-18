import java.util.*;
public class circularArrayRotation {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3,4,5));
        int k = 2;
        ArrayList<Integer> q = new ArrayList<>(Arrays.asList(1,2));
        circularArrayRotation(a,k,q);
    }
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        int n = a.size();

        for (int i = 0; i < a.size(); i++) {
            int newIndex = (i + (a.size() - (k % a.size()))) % a.size();
            arr.add(a.get(newIndex));
        }
        for (int i = 0; i < queries.size(); i++) {
            int x = queries.get(i);
            res.add(arr.get(x));
        }
        return res;
    }
}
