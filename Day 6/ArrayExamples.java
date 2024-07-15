public class ArrayExamples {
    public static void main(String[] args) {
        int[] singleDimArray = {1, 2, 3, 4, 5};
        int[][] multiDimArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("First element of singleDimArray: " + singleDimArray[0]);
        System.out.println("Element at [1][1] of multiDimArray: " + multiDimArray[1][1]);

        System.out.print("Elements of singleDimArray: ");
        for (int i = 0; i < singleDimArray.length; i++) {
            System.out.print(singleDimArray[i] + " ");
        }
        System.out.println();

        System.out.println("Elements of multiDimArray: ");
        for (int row = 0; row < multiDimArray.length; row++) {
            for (int col = 0; col < multiDimArray[row].length; col++) {
                System.out.print(multiDimArray[row][col] + " ");
            }
            System.out.println();
        }
        singleDimArray[2] = 10;
        System.out.println("Modified third element of singleDimArray: " + singleDimArray[2]);

        java.util.Arrays.sort(singleDimArray);
        System.out.print("Sorted singleDimArray: ");
        for (int num : singleDimArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = 0;
        for (int num : singleDimArray) {
            sum += num;
        }
        System.out.println("Sum of elements in singleDimArray: " + sum);
        int max = singleDimArray[0];
        for (int num : singleDimArray) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum element in singleDimArray: " + max);
        int[] copiedArray = java.util.Arrays.copyOf(singleDimArray, singleDimArray.length);
        System.out.print("Copied Array: ");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
