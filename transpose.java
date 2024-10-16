class Transpose{
    public static void main(String[] args){
        int[][] Mat ={{1,5,7},{1,5,7},{1,5,7}};
        System.out.println("Original Matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(Mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix After Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(Mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}