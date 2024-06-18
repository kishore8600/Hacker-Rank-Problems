import java.util.*;
public class subArrayDivision {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(1,2,1,3,2));
        int d=3;
        int m=2;
        birthday(s,d,m);
    }
    public static int birthday(List<Integer> s, int d, int m) {
        int count=0;
        for(int i=0;i<=s.size()-m;i++){
            int sum=0;
            for(int j=i;j<i+m;j++){
                sum = sum+s.get(j);
            }
            if(sum==d){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}

