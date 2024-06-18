import java.util.*;
public class serviceLane {
    public static void main(String[] args) {
        int n = 8;
        List<Integer> width = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3));
        List<List<Integer>> cases = new ArrayList<>();
        cases.add(Arrays.asList(0, 3));
        cases.add(Arrays.asList(4, 6));
        cases.add(Arrays.asList(6, 7));
        cases.add(Arrays.asList(3, 5));
        cases.add(Arrays.asList(0, 7));
        serviceLane(n, cases, width);
    }

    public static List<Integer> serviceLane(int n, List<List<Integer>> cases, List<Integer> width) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < cases.size(); i++) {
            int start = cases.get(i).get(0);
            int end = cases.get(i).get(1);
            int min = Integer.MAX_VALUE;
            for (int j = start; j <= end; j++) {
                int current = width.get(j);
                if (current < min) {
                    min = current;
                }
            }
            arr.add(min);
        }
        for (int i : arr) {
            System.out.println(i);
        }
        return arr;
    }
}