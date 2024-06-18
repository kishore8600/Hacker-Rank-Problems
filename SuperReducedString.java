import java.util.*;
public class SuperReducedString {
    public static void main(String[] args) {
        int n=4;
        int m=6;
        int s=2;
                ArrayList<Integer> arr = new ArrayList<>();
                int count=0;
                for(int i=1;i<=4;i++){
                    arr.add(i);
                }
                int y=Math.abs(n-m)+s;
                for(int i=0;i<arr.size();i++){
                    if(arr.get(i)==y){
                        count=arr.get(i);
                    }
                }
        System.out.println(count);
    }
}
