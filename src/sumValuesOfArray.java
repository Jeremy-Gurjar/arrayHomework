import java.util.Arrays;

public class sumValuesOfArray {

    public static void main(String[] args) {
        //Declaring and printing array
        int array1[] = {5,10,2,15};
        System.out.println("Array: " + Arrays.toString(array1));
        int total = 0;
        //for loop to calculate sum
        for (int i : array1) {
            total+=i;
        }
        //Printing array total
        System.out.println("Total of array: " + total);
    }

}
