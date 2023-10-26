class ContainerWithMostWater {
    public static int maxArea(int height[]){
        int  area=0,i=0,j=height.length-1;

        while(i<j){
            int w=j-i;
            int h=Math.min(height[i],height[j]);
            int calcArea=w*h;

            if(calcArea>area)
            area=calcArea;
            if (height[i]<height[j])
            i++;
            else
            j--;
        }
        return area;
    }
}
