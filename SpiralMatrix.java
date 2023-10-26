public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralmatrix(matrix);
    }
    public static void spiralmatrix(int a[][]){
        int startRow,StartCol;
        startRow=StartCol=0;
        int EndCol= a[0].length-1;
        int endrow = a.length-1;
        while(startRow<= endrow && StartCol <= EndCol){
            //top
            for(int j=StartCol;j<=EndCol;j++){
                System.out.print(a[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endrow;i++){
                System.out.print(a[i][EndCol]+" ");
            }
            //bottom
            for(int k= EndCol-1;k>=StartCol;k--){
                System.out.print(a[endrow][k]+" ");
            }
            //left
            for(int l = endrow-1;l>=startRow+1;l--){
                System.out.print(a[l][StartCol]+" ");
            }
            StartCol++;
            startRow++;
            endrow--;
            EndCol--;
        }
        System.out.println();
    }
}
