import java.util.*;
public class findMedian {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0,1,2,4,6,5,3));
        median(arr);
    }
    public static int median(List<Integer> arr){
        Collections.sort(arr);
        int x = arr.size();
        double res = x/2;
        int result = arr.get((int)res);
        System.out.println(result);
        return result;
    }
}
