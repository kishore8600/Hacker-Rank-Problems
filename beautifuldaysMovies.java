import java.util.*;
public class beautifuldaysMovies {
    public static void main(String[] args) {
        int start=20;
        int end=23;
        int div=6;
        beautifulDays(start,end,div);
    }
    public static int beautifulDays(int start,int end,int k){
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int i=start;i<=end;i++){
            arr.add(i);
        }

        int x=0;
        int rev=0;
        int count=0;
        for(int i=0;i<arr.size();i++) {
            x = arr.get(i);
            String sum = "";

            while (x != 0) {
                int rem = x % 10;
                sum = sum + rem;
                x = x / 10;
            }
            rev = Integer.parseInt(sum);
            arr1.add(rev);

            int res = arr.get(i) - arr1.get(i);
            if(res%2==0 && k%2==0 || res%2!=0 && k%2!=0){
                count++;
            }
        }
        System.out.println(count);
        return count;
        }
}
/*public static int beautifulDays(int start, int end, int k) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            int reversed = reverseNumber(i);
            int diff = Math.abs(i - reversed);
            if (diff % k == 0) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }*/