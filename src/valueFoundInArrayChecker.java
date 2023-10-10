import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class valueFoundInArrayChecker {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};
        System.out.println("The array is: " + Arrays.toString(array));
        int wantedValue = 8;
        System.out.println("The wanted value is: " + wantedValue);
        boolean containsValue = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == wantedValue) {
                containsValue = true;
                break;
            }
        }

        if (containsValue) {
            System.out.println("Array contains wanted value.");
        }
        else {
            System.out.println("Array does not contain wanted value.");
        }
    }
}
