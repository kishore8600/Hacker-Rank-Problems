import java.util.*;
public class breakingRecords {
    public static void main(String[] args) {
        ArrayList<Integer>  scores = new ArrayList<>(Arrays.asList(10,5,20,20,4,5,2,25,1));
        breakingRecords(scores);
    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = scores.get(0);
        int count_max=0;
        int min = scores.get(0);
        int count_min=0;
        for(int i=0;i<scores.size();i++){
            if(max<scores.get(i)){
                count_max++;
                max= scores.get(i);
            }
        }
        for(int i=0;i<scores.size();i++){
            if(min>scores.get(i)){
                count_min++;
                min= scores.get(i);
            }
        }
        result.add(count_max);
        result.add(count_min);

        for(int res:result){
            System.out.print(res+" ");
        }
        return result;
    }
}
