
class MissingValueFixedDifference {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50};
        int difference = arr[1] - arr[0];
        int missing = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + difference != arr[i + 1]) {
                missing = arr[i] + difference;
                break;
            }
        }

        System.out.println("Missing: " + missing);
    }
}
