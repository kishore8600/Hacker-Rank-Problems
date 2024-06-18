import java.util.*;
public class repeatedString {
    public static void main(String[] args) {
        String s = "a";
        long n = 10000000;
        repeatedString(s,n);
    }
    public static long repeatedString(String s, long n) {
        long length = s.length();
        long count = 0;
        for(long i=0;i<length;i++){
            if (s.charAt((int)i) == 'a') {
                count++;
            }
        }
        long fullRepetitions = n / length;
        long remainingChars = n % length;
        long additionalCount = 0;

        for (int i = 0; i<remainingChars; i++) {
            if (s.charAt((int)i) == 'a') {
                additionalCount++;
            }
        }
        count = count*fullRepetitions+additionalCount;
        System.out.println(count);
        return count;
    }
}
