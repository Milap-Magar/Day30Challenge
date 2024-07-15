public class MathExample {
    public static void main(String[] args) {
        // Math methods
        double x = 3.14;
        double y = -10;

        // Correct usage of Math methods from java.lang.Math
        double z = Math.round(x);   // Rounds x to the nearest integer
        double z1 = Math.abs(y);    // Returns the absolute value of y
        double z2 = Math.min(x, y); // Returns the smaller of x and y
        double z3 = Math.max(x, y); // Returns the larger of x and y
        double z4 = Math.floor(x);  // Returns the largest integer less than or equal to x
        double z5 = Math.ceil(x);   // Returns the smallest integer greater than or equal to x

        // Print the results
        System.out.println("Math.round(x): " + z);
        System.out.println("Math.abs(y): " + z1);
        System.out.println("Math.min(x, y): " + z2);
        System.out.println("Math.max(x, y): " + z3);
        System.out.println("Math.floor(x): " + z4);
        System.out.println("Math.ceil(x): " + z5);

        // Math.sqrt function example
        // Initialize the variables
        int a = 4, b = 9, xi = 3, yi = 2;

        // Calculate the output using sqrt
        double output = Math.sqrt((a * xi) + (b * yi));

        // Print the result
        System.out.println(output + " is the value of sqrt(a * xi + b * yi)");
    }
}
