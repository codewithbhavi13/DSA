class DuplicateNestedLoop {
    public static void main(String[] args) {
        int[] arr = {50, 100, 80, 90, 50, 100};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
