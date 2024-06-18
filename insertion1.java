import java.util.*;
public class insertion1 {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> arr = new ArrayList<>(Arrays.asList(2,4,6,8,3));
        insertionSort1(n,arr);
    }
    public static void insertionSort1(int n, List<Integer> arr) {
        int unsortedElement = arr.get(n - 1);
        int i = n - 2;

        while (i >= 0 && arr.get(i) > unsortedElement) {
            arr.set(i + 1, arr.get(i));
            i--;
            printList(arr);
        }

        arr.set(i + 1, unsortedElement);
        printList(arr);
    }

    private static void printList(List<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
