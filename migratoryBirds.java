import java.util.*;
public class migratoryBirds {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,1,2,2,3));
        migratoryBirds(arr);
    }
    public static int migratoryBirds(List<Integer> arr){
        HashMap<Integer,Integer> hp = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(!(hp.containsKey(arr.get(i)))){
                hp.put(arr.get(i),1);
            }
            else{
                hp.put(arr.get(i),hp.get(arr.get(i))+1);
            }
        }

        int maxFreq = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry: hp.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value>=maxFreq) {
                if (value > maxFreq) {
                    res.clear();
                    maxFreq = value;
                }
                res.add(key);
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i=0;i<res.size();i++){
            if(res.get(i)<min){
                min = res.get(i);
            }
        }

        System.out.println(min);
        return min;
    }
}
