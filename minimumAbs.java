import java.util.*;
public class minimumAbs {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(3,-7,0));
        minimumAbsoluteDifference(arr);

    }
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        Collections.sort(arr);
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                ar.add(Math.abs(arr.get(i)-arr.get(j)));
            }
        }
        for(int i:ar){
            System.out.print(i+" ");
        }
        int min = Integer.MAX_VALUE;
        for(int i:ar){
            if(min>i){
                min=i;
            }
        }
        System.out.println(min);
        return min;
    }
}
