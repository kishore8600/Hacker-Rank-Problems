import java.util.*;
public class lisaWorkbook {
    public static void main(String[] args) {
        int k = 3;
        List<Integer> arr = new ArrayList<>(Arrays.asList(4, 2, 6, 1, 10));
        workbook(k,arr);
    }
    public static int workbook(int k,List<Integer> arr) {
        int count=0;
        int page=0;
        for(int i=0;i<arr.size();i++){
            page++;
            for(int j=0;j<arr.get(i);j++){
                if((j+1)==page){
                    count++;
                }
                if((j+1)%k==0 && (j+1)!=arr.get(i)){
                    page++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
