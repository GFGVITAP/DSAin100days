public class CountingSort {
    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        int max = getMaxValue(array);

        System.out.println("Original Array:");
        printArray(array);

        countingSort(array, max);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    public static void countingSort(int[] arr, int max) {
        int[] countArray = new int[max + 1];
        int[] outputArray = new int[arr.length];

        // Count the occurrences of each element
        for (int value : arr) {
            countArray[value]++;
        }

        // Update countArray to store the cumulative count
        for (int i = 1; i <= max; i++) {
            countArray[i] += countArray[i - 1];
        }

        // Build the output array
        for (int i = arr.length - 1; i >= 0; i--) {
            outputArray[countArray[arr[i]] - 1] = arr[i];
            countArray[arr[i]]--;
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = outputArray[i];
        }
    }

    public static int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
