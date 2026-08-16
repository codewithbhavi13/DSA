
class SumAndCount {

    public static void main(String[] args) {
        int[] arr = {8, 2, 3};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);

        int[] amounts = {1001, 200, 9000};
        int count = 0;
        for (int i = 0; i < amounts.length; i++) {
            if (amounts[i] > 1000) {
                count++;
            }
        }
        System.out.println("Greater than 1000: " + count);
    }
}
