import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class elementInserter {
    public static void main(String[] args) {
        //Declares and initializes array, element and position
        Integer array[] = {1,2,4,5,6};
        int element = 3;
        int position = 3;

        //Prints original array
        System.out.println("Original array: " + Arrays.toString(array));

        //Adds element
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        list.add(position - 1, element);
        array = list.toArray(array);

        //Prints array with element inserted
        System.out.println("New array: " + Arrays.toString(array));
    }
}
