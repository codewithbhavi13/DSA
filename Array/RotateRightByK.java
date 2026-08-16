
class RotateRightByK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        for (int j = 0; j < k; j++) {
            int last = arr.length - 1;
            int temp = arr[last];

            for (int i = last; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
