public class TwoDArrays {
        public static void main(String[] args) {
            // 1. Declaration and Initialization
            int[][] matrix = {
                    {5, 8, 2},
                    {3, 6, 7},
                    {4, 9, 1}
            };

            // 2. Accessing and Modifying Elements
            System.out.println("Original element at [0][1]: " + matrix[0][1]);
            matrix[0][1] = 10; // Modifying the element
            System.out.println("Modified element at [0][1]: " + matrix[0][1]);

            // 3. Looping through the 2D array
            System.out.println("Elements of the 2D array:");
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println(); // Newline after each row
            }

            // 4. Summing elements of each row
            System.out.println("Sum of elements in each row:");
            for (int row = 0; row < matrix.length; row++) {
                int sum = 0;
                for (int col = 0; col < matrix[row].length; col++) {
                    sum += matrix[row][col];
                }
                System.out.println("Sum of row " + row + ": " + sum);
            }

            // 5. Summing elements of each column
            System.out.println("Sum of elements in each column:");
            for (int col = 0; col < matrix[0].length; col++) {
                int sum = 0;
                for (int row = 0; row < matrix.length; row++) {
                    sum += matrix[row][col];
                }
                System.out.println("Sum of column " + col + ": " + sum);
            }

            // 6. Finding the maximum element
            int max = matrix[0][0];
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (matrix[row][col] > max) {
                        max = matrix[row][col];
                    }
                }
            }
            System.out.println("Maximum element in the 2D array: " + max);

            // 7. Transposing the matrix
            System.out.println("Transposed Matrix:");
            int[][] transposed = new int[matrix[0].length][matrix.length];
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    transposed[col][row] = matrix[row][col];
                }
            }
            for (int row = 0; row < transposed.length; row++) {
                for (int col = 0; col < transposed[row].length; col++) {
                    System.out.print(transposed[row][col] + " ");
                }
                System.out.println();
            }
        }
}
