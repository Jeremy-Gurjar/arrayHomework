import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        //Declares array
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("This program sorts an array from lowest to highest");

        //Uses for loop to get elements of the array
        System.out.println("Enter array with a length of 10:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        //Sorts array in ascending order and prints
        Arrays.sort(array);
        System.out.println("Array from lowest to highest is " + Arrays.toString(array));
    }
}
