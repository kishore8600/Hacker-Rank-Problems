import java.util.*;
public class CaesarCipher {
    public static void main(String[] args) {
        String s = "middle-Outz";
        int k = 2;
        caesarCipher(s,k);
    }
    public static String caesarCipher(String s, int k) {
        char[] res = new char[s.length()];
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                res[i]=(char)(s.length()-'a'+k);
            }else if(Character.isUpperCase(s.charAt(i))){
                res[i]=(char)(s.length()-'A'+k);
            }else{
                res[i]=s.charAt(i);
            }
        }
        return new String(res);
    }
}
