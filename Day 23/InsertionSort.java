public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};

        System.out.println("Unsorted array:");
        printArray(array);

        insertionSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
