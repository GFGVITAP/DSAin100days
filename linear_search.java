public class linear_search {
    public static void main(String[] args) {
        int a[]={1,3,2,8,4,9,45};
        int x=45;
        int y=linearsearch(a, x);
        if(y== -1){
            System.out.println("sorry number not found");
        }
        else{
            System.out.println("the index of the number is "+ y);
        }
    }
    public  static int linearsearch(int numbers[],int key){
        // return key;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
            return i;        
            }  
        }
        return -1;
    }
}
//the time complexity of linear search is O(n).
