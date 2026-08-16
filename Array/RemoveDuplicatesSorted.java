
import java.util.Arrays;

class RemoveDuplicatesSorted {

    public static void main(String[] args) {
        int[] arr = {10, 40, 10, 40, 20, 10};
        Arrays.sort(arr);

        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(" " + arr[i]);
            }
        }
    }
}
