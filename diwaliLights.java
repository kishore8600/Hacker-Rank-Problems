import java.util.*;
public class diwaliLights {
    public static void main(String[] args) {
        int n = 663;
        lights(n);
    }
    public static long lights(int n) {
        long result= (long) Math.pow(2,n)-1;
        System.out.println(result);
        return result;
    }
}
