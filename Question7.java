public class Question7 {
    // Parameter 'number' receives a copy of primitive value
    public static void tryToDouble(int number) {
        number = number * 2; // Modifies local copy only
        System.out.println("Inside method value: " + number);
    }

    public static void main(String[] args) {
        int original = 15;
        System.out.println("Before method call: " + original);

        // Pass variable value to method
        tryToDouble(original);

        // Original variable remains unchanged in main frame
        System.out.println("After method call: " + original);
    }
}
