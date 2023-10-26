class WateringPlants1 {
    public static int wateringPlants(int[] plants ,int capacity)
    {
        int steps=0,i=0,cap=capacity;

        while(i<plants.length)
        {
            int capacityplant=plants[i];
            if(cap>=capacityplant)
            {
                cap=cap-plants[i];
                ++steps;
                ++i;
            }
            else
            {
                cap=capacity;
                steps=steps+2*i;
            }
        }
        return steps;
    }
}
