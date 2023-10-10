class Trapping_Rainwater {
    public static int trappingRainwater(int height[]){
        int n=height.length;
        int leftMax[]=new int[n];
        int rightMax[]=new int[n];

        leftMax[0]=height[0];
        rightMax[n-1]=height[n-1];

        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int waterlevel=0;
        for(int i=0;i<n;i++){
            if (Integer.min(leftMax[i], rightMax[i]) > height[i]) {
               waterlevel+=(int)(Math.min(leftMax[i],rightMax[i])-height[i]);
           }
           
        }
        return waterlevel;
    }

    public static void main(String[] args) {
        int arr[]={3,1,2,4,0,1,3,2};
        System.out.println(trappingRainwater(arr));
    }

}


