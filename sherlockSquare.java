import java.util.*;
public class sherlockSquare {
    public static void main(String[] args) {
        int a=24;
        int b=49;
        squares(a,b);
    }
    public static int squares(int a, int b) {
        int count = 0;
        int sqrtA = (int) Math.sqrt(a);
        int sqrtB = (int) Math.sqrt(b);

        if (sqrtA * sqrtA == a) {
            count++;
        }

        count += sqrtB - sqrtA;
        System.out.println(count);
        return count;
    }
}
