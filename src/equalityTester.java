import java.util.Arrays;

public class equalityTester {

    public static void main(String[] args) {
        //Declares and initializes the arrays.
        int array1[] = {1,2,3,4,5,6,7,8,9,10};
        int array2[] = {1,2,3,4,5,6,7,8,9,10};

        //if statement checks whether arrays are same or not and shows output based on the result
        if (Arrays.equals(array1, array2)) {
            System.out.println("The arrays are the same.");
        }
        else {
            System.out.println("The arrays are different.");
        }
    }
}
