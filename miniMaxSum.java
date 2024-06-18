import java.util.*;
public class miniMaxSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        miniMaxSum(arr);
    }
    public static void miniMaxSum(List<Integer> arr) {

        Collections.sort(arr);
        long minSum=0;
        long maxSum=0;
        for(int i=0;i<arr.size()-1;i++){
            minSum=minSum+arr.get(i);
        }for(int i=1;i<arr.size();i++){
            maxSum=maxSum+arr.get(i);
        }
        System.out.print(minSum+" "+maxSum);


    }
}
