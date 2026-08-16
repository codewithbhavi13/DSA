import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 40, 10, 40, 20, 10};
        Arrays.sort(arr);
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) count++;
            else {
                System.out.println(arr[i] + " -> " + count);
                count = 1;
            }
        }

        System.out.println(arr[arr.length - 1] + " -> " + count);
    }
}
