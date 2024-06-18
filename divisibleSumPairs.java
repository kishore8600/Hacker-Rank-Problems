import java.util.*;
public class divisibleSumPairs {
    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1, 3, 2, 6, 1, 2));
        divisibleSumPairs(n, k, ar);
    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.println(i+" "+j);
                int x = ar.get(i) + ar.get(j);
                if (x%k==0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
