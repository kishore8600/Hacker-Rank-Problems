import java.util.*;
public class flatLandSpacStation {
    public static void main(String[] args) {
        int n=5;
        int c[] = {0,4}; /*1,2,4,3,5*/
        flatlandSpaceStations(n,c);
    }
    static int flatlandSpaceStations(int n, int[] c) {
        List<Integer> C = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        int max = 0;
        for (int i : c) {
            C.add(i);
        }
        for (int i = 0; i < n; i++) {
            arr.add(i);
            if (C.contains(i)) {
                continue;/*correct*/
            } else {
                int val = Integer.MAX_VALUE;
                for (int j = 0; j < C.size(); j++) {
                    int x = arr.indexOf(i);
                    int z = C.get(j);
                    int current = Math.abs(z - x);
                    if (current < val) {
                        val = current;
                    }
                }
                if (val > max) {
                    max = val;
                }
            }
        }
        System.out.println(max);
        return max;
    }
}
