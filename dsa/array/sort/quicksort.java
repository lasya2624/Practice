package array.sort;

public class quicksort {
    // Swap function
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Partition function (Using While Loop)
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low]; // Choosing the first element as the pivot
        int i = low + 1; // Start i from next element
        int j = high; // j starts from last element

        while (i <= j) { // i should not cross j
            while (i <= high && arr[i] <= pivot) { // Move i right if element is smaller than pivot
                i++;
            }
            while (j > low && arr[j] > pivot) { // Move j left if element is greater than pivot
                j--;
            }
            if (i < j) { // Swap only if i and j haven't crossed
                swap(arr, i, j);
            }
        }

        // Swap pivot with j (Correct position for pivot)
        swap(arr, low, j);
        return j; // Return pivot index
    }

    // QuickSort function
    public static void quick(int arr[], int low, int high) {
        if (low < high) {
            int loc = partition(arr, low, high); // Get pivot index

            quick(arr, low, loc - 1); // Sort left side
            quick(arr, loc + 1, high); // Sort right side
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 3, 2, 8, 7};
        int n = arr.length;

        quick(arr, 0, n - 1); // Call QuickSort

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) { // Correct loop for printing
            System.out.print(arr[i] + " ");
        }
    }
}
