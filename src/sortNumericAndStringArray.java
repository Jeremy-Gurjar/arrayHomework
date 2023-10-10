import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class sortNumericAndStringArray {

    public static void main(String[] args) {
        sortNumArray();
        sortStrArray();
    }

    //Sorts numerical array
    public static void sortNumArray() {
        int numArray[] = {1,2,3,6,5,4};
        System.out.println("Original array: " + Arrays.toString(numArray));
        //Sorting array
        Arrays.sort(numArray);
        //printing out sorted array
        System.out.println("Sorted array: " + Arrays.toString(numArray));
    }

    //
    public static void sortStrArray() {
        //Initialize and print original array
        String strArray[] = {"c", "b", "a"};
        System.out.println("Original array: " + Arrays.toString(strArray));
        //Sort and print sorted array
        Arrays.sort(strArray);
        System.out.println("Sorted array: " + Arrays.toString(strArray));


    }
}
