import java.util.*;
public class cutSticks {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 4, 4, 2, 2, 8));
        cutTheSticks(arr);
    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        ArrayList<Integer> res = new ArrayList<>();
        Collections.sort(arr);
        int min=0;
        while(arr.size()!=0){
            min = arr.get(0);
            res.add(arr.size());
            arr.removeAll(Arrays.asList(min));

            for(int i=0;i>arr.size();i++){
                arr.set(i,arr.get(i)-min);
            }
        }

        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
        return res;
    }
}
