class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {50, 0, 100, 80, 0};
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }

        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}
