import java.util.*;
public class equalsArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,2,3));
        equalizeArray(arr);
    }
    public static int equalizeArray(List<Integer> arr) {
        HashMap<Integer,Integer> ar = new HashMap<>();
        for (int i : arr) {
            ar.put(i, ar.getOrDefault(i, 0) + 1);
        }
        int maxFrequency = Collections.max(ar.values());
        System.out.println(arr.size()-maxFrequency);
        return arr.size()-maxFrequency;
    }
}
