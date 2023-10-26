
    //selection sort involves
    //pick the smallest from the unsorted aarray and we directly swap it to the required position 
    //the difference between bubble sort and slection sort is that the unnecessary swaps in the bubble sort arent done in the selection sort
    //instead the identified element is swapped only once to the required position
    //step1:find the smallest element in the arrray in the specified range
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 14, 3, 2, 43, 11, 58, 22};

        System.out.println("Before sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("After sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


   


    

