// SearchInSortedMatrix
// Bruteforce: Linear Search( row,column wise ) 
//             Time Complexity : O(n*n)
// Better: Binary Searvh( Row wise )
//             Time Complexity : O(nlog n )
// Optimal: StairCase Search
//             Time Complexity : O(n+m)

class StairCaseSearch
{
    public static boolean staircaseSearch(int matrix[][],int key)
    {
        int row=0,col=matrix[0].length-1;
        int n=matrix.length-1;

        while(row<=n && col>=0)
        {
            int i=row,j=col;
            if(matrix[row][col]==key)
            {
                System.out.println("Key found at ("+i+","+j+")");
                return true;}
            else if(key<matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("Key not found ");
        return false;
    }
}
