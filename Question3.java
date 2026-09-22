public class Question3 {
    // Void method: directly prints output to console
    public static void printBanner() {
        System.out.println("===============================");
    }

    // Returning method: returns string value to caller
    public static String getBanner() {
        return "===============================";
    }

    public static void main(String[] args) {
        // Execute void method directly
        printBanner();

        // Capture returned String and print it
        String banner = getBanner();
        System.out.println(banner);
    }
}
