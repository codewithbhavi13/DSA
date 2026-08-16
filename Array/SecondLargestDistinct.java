class SecondLargestDistinct {
    public static void main(String[] args) {
        int[] arr = {50, 50, 40, 30};
        int l1 = arr[0], l2 = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > l1) {
                l2 = l1;
                l1 = arr[i];
            } else if (arr[i] < l1 && arr[i] > l2) {
                l2 = arr[i];
            }
        }

        System.out.println("Largest: " + l1);
        System.out.println("Second largest distinct: " + l2);
    }
}
