import java.util.*;
public class test{
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        ArrayList<Integer> result= new ArrayList<>();
        ArrayList<Integer> result2= new ArrayList<>();
        for(int num :ar){
            if(!result2.contains(num)){
                result2.add(num);
            }
        }
        for(int i=0;i<result2.size();i++){
            int count=0;
            for(int j=0;j<ar.size();j++){
                if(result2.get(i)==ar.get(j)){
                    count++;
                }

            }
            result.add(count);
        }
        for(int i:result){
            System.out.print(i+" ");
        }
        int sum=0;
        for(int i:result){
            int pair=i/2;
            sum+=pair;
        }
        System.out.println(sum);
    }
}