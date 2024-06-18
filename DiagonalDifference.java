import java.util.*;
public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 2, 3));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(9, 8, 9));
        diagonalDifference(arr);
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int right=0;
        int left=0;
        for(int i=0;i<arr.size();i++){
            right+=arr.get(i).get(i);
            left+=arr.get(i).get(arr.size()-1-i);
        }
        int res = Math.abs(right-left);
        System.out.println(res);
        return res;
    }
}
