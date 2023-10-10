import java.util.Arrays;

public class arrayReverser {
    public static void main(String[] args) {
        //Declares and prints original array
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original array: " + Arrays.toString(array));

        //Reverses and prints new array
        System.out.print("Reversed array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
    }
}
