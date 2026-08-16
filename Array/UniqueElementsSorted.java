
import java.util.Arrays;

class UniqueElementsSorted {

    public static void main(String[] args) {
        int[] arr = {10, 40, 10, 40, 20, 10, 100};
        Arrays.sort(arr);

        if (arr.length == 1) {
            System.out.print(arr[0]);
            return;
        }

        if (arr[0] != arr[1]) {
            System.out.print(arr[0] + " ");
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        int last = arr.length - 1;
        if (arr[last] != arr[last - 1]) {
            System.out.print(arr[last]);
        }
    }
}
