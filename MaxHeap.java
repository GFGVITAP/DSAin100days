import java.util.*;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public void insert(int key) {
        if (size >= capacity) {
            System.out.println("Heap is full. Cannot insert more elements.");
            return;
        }

        size++;
        int currentIndex = size - 1;
        heap[currentIndex] = key;

        while (currentIndex > 0 && heap[currentIndex] > heap[parent(currentIndex)]) {
            swap(currentIndex, parent(currentIndex));
            currentIndex = parent(currentIndex);
        }
    }

    private void heapify(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    public int extractMax() {
        if (size <= 0) {
            System.out.println("Heap is empty.");
            return -1;
        }

        if (size == 1) {
            size--;
            return heap[0];
        }

        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);

        return max;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);

        maxHeap.insert(4);
        maxHeap.insert(10);
        maxHeap.insert(8);
        maxHeap.insert(15);
        maxHeap.insert(20);

        System.out.println("Max Heap:");
        maxHeap.printHeap();

        int max = maxHeap.extractMax();
        System.out.println("Extracted max element: " + max);
        System.out.println("Max Heap after extraction:");
        maxHeap.printHeap();
    }
}
