public class ThreeDArrayExample {
    public static void main(String[] args) {
        // Define the dimensions of the 3D array
        int xSize = 3;
        int ySize = 4;
        int zSize = 2;

        // Create a 3D array with the specified dimensions
        int[][][] threeDArray = new int[xSize][ySize][zSize];

        // Initialize the 3D array with some values
        int value = 1;
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                for (int z = 0; z < zSize; z++) {
                    threeDArray[x][y][z] = value;
                    value++;
                }
            }
        }

        // Access and print elements from the 3D array
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                for (int z = 0; z < zSize; z++) {
                    System.out.println("threeDArray[" + x + "][" + y + "][" + z + "] = " + threeDArray[x][y][z]);
                }
            }
        }
    }
}
