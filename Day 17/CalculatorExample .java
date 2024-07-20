@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class CalculatorExample {
    public static void main(String[] args) {
        // Lambda expression for addition
        Calculator add = (a, b) -> a + b;
        // Lambda expression for subtraction
        Calculator subtract = (a, b) -> a - b;

        System.out.println("Addition: " + performOperation(5, 3, add)); // 8
        System.out.println("Subtraction: " + performOperation(5, 3, subtract)); // 2
    }

    // Method that takes a Calculator and performs an operation
    private static int performOperation(int a, int b, Calculator calculator) {
        return calculator.operate(a, b);
    }
}
