public class BuyAndSellStocks {
    public static void main(String[] args) {
        int stocks[]= {7,1,5,3,6,4};
        System.out.println(MaxProfit(stocks));

    }
    public static int MaxProfit(int a[]){
        //find the minimum of the given array to buy the stock at min price
        int min=Integer.MAX_VALUE;
        for(int i:a){
             min= Math.min( min,i);
        }
        //Now we calculate the maximum element in the remaining right part of the given array wrt to the min element
        //finding the index of the minimum elemnt in the given array
        int minindex =0;
        for(int i=0;i<a.length;i++){
            if(a[i]== min){
                 minindex = i;
            }
        }
        int maxindex=0;
        for(int i=minindex;i<a.length;i++){
            maxindex = Math.max(a[i],a[minindex]);

        }
        if(maxindex==minindex){
            return 0;
        }
        return a[maxindex]-a[minindex];
        

    }
    
}
