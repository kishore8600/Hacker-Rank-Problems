import java.util.*;
public class jumpingCloud {
    public static void main(String[] args) {
        int [] c = {1,1,1,0,1,1,0,0,0,0};
        int k = 3;
        jumpingOnClouds(c,k);
    }
    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        int i=0;
        int n = c.length;
        do {
            if (c[i] == 1) {
                e -= 2 + 1; // Decrease energy by 2 if thundercloud, and 1 for the move
            } else {
                e -= 1; // Decrease energy by 1 for normal cloud
            }
            i = (i + k) % n; // Update the position considering the jump distance k
        } while (i != 0);
        System.out.println(e);
        return e;
    }
}
