import java.util.*;
public class marcCakewalk {
    public static void main(String[] args) {
        ArrayList<Integer> calorie = new ArrayList<>(Arrays.asList(1,3,2));
        marcsCakewalk(calorie);
    }
    public static long marcsCakewalk(List<Integer> calorie) {
        Collections.sort(calorie,Collections.reverseOrder());
        long result=0;
        for(int i=0;i<calorie.size();i++){
            result+=(long)(calorie.get(i)*Math.pow(2,i));
        }
        System.out.println(result);
        return result;
    }
}
