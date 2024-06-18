import java.util.*;
public class fairRation {
    public static void main(String[] args) {
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6));
        fairRations(B);
    }
    public static String fairRations(List<Integer> B) {
        int count=0;
        for(int i=0;i<B.size();i++){
            if(B.get(i)%2==0){
                if(i<B.size()-1){
                    B.set(i+1,B.get(i)+1);
                    count++;
                }
            }else if(B.get(i)%1==0){
                B.set(i,B.get(i)+1);
                B.set(i+1,B.get(i)+1);
                count++;
            }
        }
        if(count==0){
            return "NO";
        }else{
            return Integer.toString(count);
        }
    }
}
