
class CheckSortedArray {

    public static void main(String[] args) {
        int[] arr = {10, 40, 30, 50};
        boolean flag = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "Sorted" : "Not Sorted");
    }
}
