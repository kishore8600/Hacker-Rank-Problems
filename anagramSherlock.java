import java.lang.reflect.Array;
import java.util.*;
public class anagramSherlock {
    public static void main(String[] args) {
        String s = "abba";
        sherlockAndAnagrams(s);
    }
    public static int sherlockAndAnagrams(String s) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                 arr.add(s.substring(i,j));
            }
        }
        for(String x :arr){
            System.out.print(x+" ");
        }
        int count=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                String s1 = arr.get(i).toLowerCase();
                String s2 = arr.get(j).toLowerCase();
                if(s1.length()==s2.length()){
                    char[] a = s1.toCharArray();
                    char[] b = s2.toCharArray();
                    Arrays.sort(a);
                    Arrays.sort(b);
                    if(Arrays.equals(a,b)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
