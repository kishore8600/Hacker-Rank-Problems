import java.util.*;
public class tutorialChallenge {
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 9, 12));
        introTutorial(v,arr);
    }
    public static int introTutorial(int v, List<Integer> arr) {
        int result=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==v){
                result = i;
            }
        }
        System.out.println(result);
        return result;
    }
}
