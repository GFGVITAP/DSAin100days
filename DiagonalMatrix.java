public class DiagonalMatrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // System.out.println(matrix[0].length);
        Diag(matrix);
    }
    public static void Diag(int [][]a){
        int sum =0;
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[0].length;j++){
        //         //primary
        //         if(i==j){

        //             sum += a[i][j];
        //         }
        //         if(i+j==a.length-1){
        //             sum+=a[i][j];
        //             // System.out.println(a[i][j]);
        //         }
        //     }
        // }System.out.println(sum);
        //-----------optimised code----------------
        for(int i=0;i<a.length;i++){
            //primary
            sum+=a[i][i];
            //secondary
            if(i!= a.length-1-i){
            sum+= a[i][a.length-1-i];
            }
             
            
        }
        System.out.println(sum);
    }
    
}
