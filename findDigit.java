import java.util.*;
public class findDigit {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();

        for(int i =0;i<t;i++){
            int n = ip.nextInt();
            int result = find_digit(n);
            System.out.println(result);
        }
        ip.close();
    }
    public static int find_digit(int n){
        int count=0;
        int temp=n;
        while(temp!=0) {
            int rem = temp % 10;
            if (rem!=0 && n % rem == 0) {
                count++;
            }
            temp = temp / 10;
        }
        System.out.println(count);
        return count;
    }
}
