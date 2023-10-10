import java.util.Arrays;
import java.util.List;

public class indexFinder {

    public static void main(String[] args) {
        //initialise wanted element and index
        int array[] = {1,2,3,4,5};
        int wantedElement = 4;
        int index = 0;

        //for loop checks index
        for (int i = 0; i < array.length; i++) {
            if (array[i] == wantedElement) {
                index = i;
                break;
            }
        }

        //Prints index
        System.out.println("The index of the wanted value is " + index);
    }

}
