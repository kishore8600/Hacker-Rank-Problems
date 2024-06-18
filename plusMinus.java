import java.util.*;
public class plusMinus {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        plusMinus(arr);
    }
    public static void plusMinus(List<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                pos.add(arr.get(i));
            }else if(arr.get(i)<0){
                neg.add(arr.get(i));
            } else if (arr.get(i)==0) {
                zero.add(arr.get(i));
            }
        }

        float pos1 = ((float)pos.size()/arr.size());
        float neg1 = ((float)neg.size()/arr.size());
        float zero1 = ((float)zero.size()/arr.size());
        System.out.println(pos1);
        System.out.println(neg1);
        System.out.println(zero1);


    }
}
