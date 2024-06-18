import java.util.*;
public class socksMatch {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        int n=9;
        sockMerchant(n,ar);
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer,Integer> socks = new HashMap<>();
        for(int i=0;i<ar.size();i++){
            int x = ar.get(i);
            if(!socks.containsKey(x)){
                socks.put(x,1);
            }
            else{
                socks.put(x,socks.get(x)+1);
            }
        }
        int sum=0;
        for (int color : socks.keySet()) {
            int count = socks.get(color);
            int pairs = count / 2;
            sum += pairs;
        }
        System.out.println(sum);
        return sum;
    }
}