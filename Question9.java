// Base class with overloaded methods
class Printer {
    // Overloaded method version A
    public void printData(String text) {
        System.out.println("Base String: " + text);
    }

    // Overloaded method version B
    public void printData(int number) {
        System.out.println("Base Integer: " + number);
    }
}

// Subclass overriding one overloaded version
class CustomPrinter extends Printer {
    // Overrides String parameter version from base class
    @Override
    public void printData(String text) {
        System.out.println("Subclass String (uppercase): " + text.toUpperCase());
    }
}

public class Question9 {
    public static void main(String[] args) {
        CustomPrinter printer = new CustomPrinter();

        // Triggers overridden method in subclass
        printer.printData("Shrp Fedeeee!!");

        // Triggers inherited overloaded method from superclass
        printer.printData(100);
    }
}
