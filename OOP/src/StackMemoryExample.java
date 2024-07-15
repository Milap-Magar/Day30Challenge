package src;

    public class StackMemoryExample {
        public static void main(String[] args) {
            int a = 10; // Local variable stored in stack
            int result = factorial(a); // Method call creates a new stack frame
            System.out.println("Factorial of " + a + " is " + result);
        }

        public static int factorial(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1); // Recursive call creates new stack frames
            }
        }
    }

