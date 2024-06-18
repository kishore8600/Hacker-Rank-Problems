import java.util.*;
public class hurdleRace {
    public static void main(String[] args) {
        int k = 4;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,6,3,5,2));
        hurdleRace(k,arr);
    }
    public static int hurdleRace(int k, List<Integer> arr) {

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max){
                max = arr.get(i);
            }
        }
        int res=0;
        if(k>max){
            System.out.println("0");
        }else{
            res=max-k;
            System.out.println(res);
        }

        return res;
    }
}
