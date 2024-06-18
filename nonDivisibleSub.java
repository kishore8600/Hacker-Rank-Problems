import java.util.*;
public class nonDivisibleSub {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(278,576,496,727,410,124,338,149,209,702,282,718,771,575,436));
        int k = 7;/**/
        nonDivisibleSubset(k,s);
    }
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] remainders = new int[k];

        // Calculate counts of remainders
        for (int num : s) {
            remainders[num % k]++;
        }

        // Initialize the count of numbers included in the subset
        int subsetLength = 0;

        // Include at most one number with remainder 0 if it exists
        subsetLength += Math.min(remainders[0], 1);

        // Include at most one number with remainder k/2 if it exists
        if (k % 2 == 0) {
            subsetLength += Math.min(remainders[k / 2], 1);
        }

        // Include the larger count between each pair of remainders (i, k-i)
        for (int i = 1; i <= k / 2; i++) {
            if (i != k - i) {
                subsetLength += Math.max(remainders[i], remainders[k - i]);
            }
        }

        return subsetLength;
    }
}
