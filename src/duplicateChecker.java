public class duplicateChecker {

    public static void main(String[] args) {
        //initialize array
        int array[] = {1,2,3,3,4,4,5};

        //for loop to iterate through array to find duplicate.
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + " is duplicated.");
                }
            }
        }
    }
}
