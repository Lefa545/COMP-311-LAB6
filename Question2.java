public class Question2 {
    // Calculates and returns the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Test calls using two different radius values
        System.out.println("Area (radius 3.0): " + circleArea(3.0));
        System.out.println("Area (radius 5.5): " + circleArea(5.5));
    }
}
