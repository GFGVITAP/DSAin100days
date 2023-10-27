public class SearchMatrix {
    public static boolean searchInSortedMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols - 1; // Start from the top-right corner

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                // If the current element is less than the target, move down in the matrix
                row++;
            } else {
                // If the current element is greater than the target, move left in the matrix
                col--;
            }
        }

        return false; // Element not found in the matrix
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 13}
        };

        int target = 6;
        boolean result = searchInSortedMatrix(matrix, target);

        if (result) {
            System.out.println("Element " + target + " is found in the matrix.");
        } else {
            System.out.println("Element " + target + " is not found in the matrix.");
        }
    }
}
