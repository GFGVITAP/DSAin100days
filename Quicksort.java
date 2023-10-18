public class QuickSort {
  // This function takes the last element of the array as a pivot
  // and places it in its correct position in the sorted array.
    int partition(int a[], int start, int end) {
        int pivot = a[end]; 
        int i = (start - 1);
        for (int j = start; j <= end - 1; j++) {
            
            if (a[j] < pivot) {
                i++; 
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        // Swap the pivot element (a[end]) with the element at a[i+1] to place the pivot in the correct position
        int t = a[i + 1];
        a[i + 1] = a[end];
        a[end] = t;
        return (i + 1);
    }
  
    // This is the main quicksort function that recursively sorts the array
    void quick(int a[], int start, int end) 
    {
        if (start < end) {
            int p = partition(a, start, end); 
            // Recursively sort the elements before and after the pivot
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }

    // Function to print the elements of the array
    void printArr(int a[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args) {
        int a[] = { 45, 12, 59, 76, 6, 38 };
        int n = a.length;
        System.out.println("\nBefore sorting array elements are - ");
        QuickSort q1 = new QuickSort();
        q1.printArr(a, n);
        q1.quick(a, 0, n - 1);
        System.out.println("\nAfter sorting array elements are - ");
        q1.printArr(a, n);
        System.out.println();
    }
}
