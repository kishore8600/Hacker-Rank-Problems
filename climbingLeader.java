import java.util.*;
public class climbingLeader {
    public static void main(String[] args) {
       ArrayList<Integer> ranked = new ArrayList<>(Arrays.asList(100,100,50,40,40,20,10));
       ArrayList<Integer> player = new ArrayList<>(Arrays.asList(5,25,50,120));
       climbingLeaderboard(ranked,player);
    }
    public static HashMap climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        HashMap<Integer,Integer> arr = new HashMap<>();
        for(int i=0;i<ranked.size();i++){
            int x = ranked.get(i);
            if(!arr.containsKey(x)){
                arr.put(x,1);
            }
            else{
                arr.put(x,arr.get(x)+1);
            }
        }
        ArrayList<Integer> keys = new ArrayList<>(arr.keySet());
        Collections.sort(keys);

        HashMap<Integer, Integer> sortedMap = new HashMap<>();
        for (int key : keys) {
            sortedMap.put(key, arr.get(key));
        }
        for(int i: arr.keySet()){
            System.out.println(arr);
        }
        return arr;
    }
}
