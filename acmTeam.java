import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class acmTeam {
    public static void main(String[] args) {
        ArrayList<String> topic = new ArrayList<>(Arrays.asList("10101","11100", "11010","00101"));
        ArrayList<Integer> yes = acmTeam(topic);
        for (int i : yes) {
            System.out.println(i);
        }
    }
    public static ArrayList<Integer> acmTeam(ArrayList<String> topic) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> yes = new ArrayList<>();
        for(int i=0;i<topic.size();i++){
            String x = topic.get(i);
            for(int j=i+1;j<topic.size();j++){
                int count=0;
                String y = topic.get(j);
                for(int a=0;a<x.length();a++){
                    char x1 = x.charAt(a);
                    char y1 = y.charAt(a);
                    if(x1=='1'|y1=='1'){
                        count++;
                    }
                }
                result.add(count);
            }
        }
        HashMap<Integer,Integer> out = new HashMap<>();
        for(int i: result){
            out.put(i,out.getOrDefault(i,0)+1);
        }
        int maxKey = Integer.MIN_VALUE;
        int maxFrequency = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : out.entrySet()) {
            if (entry.getKey() > maxKey) {
                maxKey=entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        yes.add(maxKey);
        yes.add(maxFrequency);
        return yes;
    }
}
