import java.util.*;
public class minimumDistances {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 1, 3, 4, 1, 7));
        minimumDistances(arr);
    }
    public static int minimumDistances(List<Integer> arr) {

        Map<Integer, Integer> lastIndexMap = new HashMap<>(); // Map to store last seen index of each element
        int minDistance = Integer.MAX_VALUE; // Initialize minimum distance to maximum integer value

        for (int i = 0; i < arr.size(); i++) {
            int currentElement = arr.get(i);
            if (lastIndexMap.containsKey(currentElement)) { // If the current element has been seen before
                int lastSeenIndex = lastIndexMap.get(currentElement);
                int distance = i - lastSeenIndex;
                minDistance = Math.min(minDistance, distance); // Update minDistance if necessary
            }
            lastIndexMap.put(currentElement, i); // Update the last seen index of the current element
        }

        if (minDistance == Integer.MAX_VALUE) {
            return -1; // If no matching elements found, return -1
        }
        return minDistance;

        /*ArrayList<Integer> res = new ArrayList<>();
        int min = res.get(0);
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if(arr.get(i)==arr.get(j)){
                    int x = i-j;
                    if(x>0){
                        res.add(x);
                    }
                }
            }
        }
        for(int i=0;i<res.size();i++){
            if(res.get(i)<min){
                min = res.get(i);
            }
        }
        System.out.println(min);
        return min;*/
    }
}
