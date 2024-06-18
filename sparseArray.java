import java.util.*;
public class sparseArray {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("ab","ab","abc"));
        ArrayList<String> queries = new ArrayList<>(Arrays.asList("ab","abc","bc"));
        matchingStrings(strings,queries);
    }
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> res = new ArrayList<>();

        for(int i=0;i<queries.size();i++){
            int count=0;
            for(int j=0;j<strings.size();j++){
                if(strings.get(j)==queries.get(i)){
                    count++;
                }
            }
            res.add(count);
            System.out.println(count);
        }
        return res;
    }
}
