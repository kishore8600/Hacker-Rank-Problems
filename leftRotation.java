import  java.util.*;
public class leftRotation {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        System.out.println(A);

        System.out.print("Enter the d=");
        int d = ip.nextInt();

        int rotations = d % A.size();

        for (int i = 0; i < A.size(); i++) {
            int newPosition = (i +rotations) % A.size();
            B.add(A.get(newPosition));
        }
        System.out.println(B);
    }
}
