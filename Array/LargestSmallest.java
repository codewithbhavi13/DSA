
public class LargestSmallest {

    public static void main(String[] args) {
        int[] transactions = {4500, 1200, 7800};
        int smallest = transactions[0];
        int largest = transactions[0];

        for (int i = 1; i < transactions.length; i++) {
            if (transactions[i] < smallest) {
                smallest = transactions[i];
            }
            if (transactions[i] > largest) {
                largest = transactions[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
