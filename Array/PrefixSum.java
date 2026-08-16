
public class PrefixSum {

    public static void main(String[] args) {
        int start = 1;
        int end = 3;
        int[] arr = {5, 10, 15, 20};
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(prefix[i] + " ");
        }

        int prefixSum;
        if (start == 0) {
            prefixSum = prefix[end]; 
        }else {
            prefixSum = prefix[end] - prefix[start - 1];
        }

        System.out.println("\nRange Sum: " + prefixSum);
    }
}
