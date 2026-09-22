public class Question5 {
    // Overload 1: Displays name only
    public static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Overload 2: Displays name and age
    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Test overload taking 1 parameter
        displayInfo("Alice");

        // Test overload taking 2 parameters
        displayInfo("Bob", 22);
    }
}
