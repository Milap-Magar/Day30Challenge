public class TailRecursionExample {

    // Tail-recursive method to find factorial of a number
    public static int factorialTail(int n, int a) {
        if (n == 0) {
            return a; // Base case: return the accumulated result
        } else {
            return factorialTail(n - 1, n * a); // Tail-recursive call
        }
    }

    // Helper method to start the tail-recursive process
    public static int factorial(int n) {
        return factorialTail(n, 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}
