public class Question4 {
    // Overload 1: Adds two integers
    public static int combine(int a, int b) {
        return a + b;
    }

    // Overload 2: Concatenates two Strings
    public static String combine(String a, String b) {
        return a + b;
    }

    // Overload 3: Adds two doubles
    public static double combine(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Compiler selects matching overload based on argument types
        System.out.println(combine(4, 0.5));               // Calls int version
        System.out.println(combine("Eksee, ", "Lefa!")); // Calls String version
        System.out.println(combine(1.1, 1.1));            // Calls double version
    }
}
