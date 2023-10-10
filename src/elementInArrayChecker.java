public class elementInArrayChecker {
    public static void main(String[] args) {
        String array[] = {"1", "hello", "world"};
        String element = "hello";

        for (String i : array) {
            if (i.equals(element)) {
                System.out.println("Your element '" + element + "' is found");
                System.exit(0);
            }
        }

        System.out.println("Your element '" + element + "' is not found");
    }
}
