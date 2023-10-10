public class commonElementFinder {

    public static void main(String[] args) {
        //Declare and initializes arrays
        String array1[] = {"array", "2", "3"};
        String array2[] = {"hello", "1", "array", "2"};

        //For loops iterate through arrays to find common elements and prints them out.
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println("'" + array1[i] + "'" + " is a common element.");
                }
            }
        }
    }
}
