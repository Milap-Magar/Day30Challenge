import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {
        arrayOperations();
    }

    public static void arrayOperations() {
        // Declaring and Initializing Arrays
        int[] numbers = new int[5]; // An array of integers with 5 elements
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // Alternatively, you can initialize an array with values at the time of declaration
        int[] numbersInitialized = {1, 2, 3, 4, 5};

        // Traversing Arrays

        // Using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Using a for-each loop
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }

        // Multidimensional Arrays

        // Declaring and Initializing a 2D Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Traversing a 2D Array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at matrix[" + i + "][" + j + "]: " + matrix[i][j]);
            }
        }

        // Using a for-each loop for a 2D Array
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.println("Element: " + elem);
            }
        }

        // Array Utility Methods from java.util.Arrays
        int[] unsortedArray = {5, 2, 8, 1, 3};
        System.out.println("Unsorted array: " + Arrays.toString(unsortedArray));

        // Sorting an array
        Arrays.sort(unsortedArray);
        System.out.println("Sorted array: " + Arrays.toString(unsortedArray));

        // Searching for an element (binary search)
        int index = Arrays.binarySearch(unsortedArray, 3);
        System.out.println("Element 3 found at index: " + index);

        // Filling an array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled array: " + Arrays.toString(filledArray));
    }
}
