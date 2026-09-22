public class Question1 {
    // Static method returning true if n is even, false otherwise
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        // Test calls with even and odd integers
        System.out.println("Is 4 even? " + isEven(4));
        System.out.println("Is 7 even? " + isEven(7));
    }
}