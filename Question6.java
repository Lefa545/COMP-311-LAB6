class Calculator {
    // Instance variable tracking method calls
    private int callCount = 0;

    // Static method: associated with class, no instance required
    public static int add(int a, int b) {
        return a + b;
    }

    // Instance method: requires object instance, updates instance state
    public int multiply(int a, int b) {
        callCount++; // Increments caller count per invocation
        return a * b;
    }

    // Getter for callCount
    public int getCallCount() {
        return callCount;
    }
}

public class Question6 {
    public static void main(String[] args) {
        // Calling static method using class name directly
        System.out.println("Add result: " + Calculator.add(4, 6));

        // Instantiating class to call instance method
        Calculator calc = new Calculator();
        System.out.println("Multiply 1: " + calc.multiply(3, 5));
        System.out.println("Multiply 2: " + calc.multiply(2, 4));

        // Verify call count state stored on instance
        System.out.println("Multiply invocation count: " + calc.getCallCount());
    }
}