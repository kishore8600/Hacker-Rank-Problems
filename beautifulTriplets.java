import  java.util.*;
public class beautifulTriplets {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 7, 8, 10));
        int d=3;
        beautifulTriplets(d,arr);
    }
    public static int beautifulTriplets(int d, List<Integer> arr) {
        int count =0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                for(int k=0;k<arr.size();k++){
                    int first = arr.get(i)-arr.get(j);
                    if(first==3){
                        int second = arr.get(j)-arr.get(k);
                        if(second==3){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
