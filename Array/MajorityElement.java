
import java.util.*;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2, 2, 7};

        Arrays.sort(arr);
        int count = 1;
        boolean found = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++; 
            }else {
                count = 1;
            }

            if (count > arr.length / 2) {
                System.out.println("Majority: " + arr[i]);
                found = true;
                break;
            }
        }

        if (!found && count > arr.length / 2) {
            System.out.println("Majority: " + arr[arr.length - 1]);
            found = true;
        }

        if (!found) {
            System.out.println("No majority");
        }
    }
}
