import java.util.*;
public class gradingStudent {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(73,67,38,33));
        grading(grades);
    }
    public static List<Integer> grading(List<Integer> grades) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < grades.size(); i++) {
            int x = grades.get(i);
            if (x >= 38) {
                int div = x % 5;
                int rem = 5 - div;
                if (rem < 3) {
                    result.add(x + rem);
                } else {
                    result.add(x);
                }
            } else {
                result.add(grades.get(i));
            }
        }
        for(int grades1 :grades){
            System.out.println(grades1);
        }
        return result;
    }
}
