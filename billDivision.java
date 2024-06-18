import java.util.*;
public class billDivision {
    public static void main(String[] args) {
        ArrayList<Integer> bill = new ArrayList<>(Arrays.asList(3,10,2,9));
        int k = 1;
        int b = 12;
        bonAppetit(bill,k,b);
    }
    public static void bonAppetit(List<Integer> bill, int k, int b) {

        bill.remove(k);
        for(int res : bill){
            System.out.print(res+" ");
        }
        int sum=0;
        for(int i=0;i<bill.size();i++){
            sum=sum+bill.get(i);
        }
        int org = (int)sum/2;
        System.out.println(org);
        int amount = b-org;
        System.out.println(amount);
        if(amount==0){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(amount);
        }
    }
}
