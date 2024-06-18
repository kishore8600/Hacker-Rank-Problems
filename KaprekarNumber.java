import java.sql.SQLOutput;
import java.util.*;
public class KaprekarNumber {
    public static void main(String[] args) {
        int p=1;
        int q=100;
        kaprekarNumbers(p,q);
    }
    public static void kaprekarNumbers(int p, int q) {
        for (int i = p; i <= q; i++) {
            int squr = (int) Math.pow(i, 2);
            String change = Integer.toString(squr);
            int length = change.length();
            int midpoint = length / 2;
            String[] digits = new String[2];
            if (midpoint == 0) {
                String first = change.substring(0, 1);
                String second = "0";
                digits[0] = first;
                digits[1] = second;
            } else {
                String first = change.substring(0, midpoint);
                String second = change.substring(midpoint);
                digits[0] = first;
                digits[1] = second;
            }
            int total = 0;
            for (int j = 0; j < digits.length; j++) {
                String digitChar = digits[j];
                total += Integer.parseInt(digitChar);
            }
            if (total == i) {
                System.out.print(i + " ");
            }
        }
    }
}
/*char digitChar = digits.charAt(j);
                int digitInt = Character.getNumericValue(digitChar);
                total+=Character.getNumericValue(digits.charAt(j));

                char[] digits1 = first.toCharArray();
            char[] digits2 = second.toCharArray();
            int total1 = first.length()+second.length();
            char[] digits = new char[total1];*/