package Day 26;

public class MergeSort {
        // Merges two subarrays of arr[]
        private void merge(int arr[], int left, int mid, int right) {
            // Sizes of the two subarrays
            int n1 = mid - left + 1;
            int n2 = right - mid;
    
            // Temporary arrays to hold the subarrays
            int L[] = new int[n1];
            int R[] = new int[n2];
    
            // Copy data to temporary arrays
            for (int i = 0; i < n1; ++i)
                L[i] = arr[left + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[mid + 1 + j];
    
            // Merge the temporary arrays
    
            // Initial indices of the first and second subarrays
            int i = 0, j = 0;
    
            // Initial index of the merged subarray
            int k = left;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
    
            // Copy remaining elements of L[] if any
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }
    
            // Copy remaining elements of R[] if any
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
    
        // Main function that sorts arr[left...right] using merge()
        public void sort(int arr[], int left, int right) {
            if (left < right) {
                // Find the middle point
                int mid = left + (right - left) / 2;
    
                // Sort first and second halves
                sort(arr, left, mid);
                sort(arr, mid + 1, right);
    
                // Merge the sorted halves
                merge(arr, left, mid, right);
            }
        }
    
        // Utility function to print the array
        static void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    
        // Driver method
        public static void main(String args[]) {
            int arr[] = {12, 11, 13, 5, 6, 7};
    
            System.out.println("Given Array");
            printArray(arr);
    
            MergeSort ob = new MergeSort();
            ob.sort(arr, 0, arr.length - 1);
    
            System.out.println("\nSorted array");
            printArray(arr);
        }
        
}
