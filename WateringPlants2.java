class WateringPlants2 {
    public static int minimumRefill(int plants[] , int capacityA,int capacityB){
        int capA=capacityA,capB=capacityB;
        int refillA=0,refillB=0;
        int i=0,j=plants.length-1;

        while(i<j){
            if(capA<plants[i])
            {
                refillA++;
                capA=capacityA;
            }
            if(capB<plants[j])
            {
                refillB++;
                capB=capacityB;
            }

            capA=capA-plants[i];
            capB=capB-plants[j];
            i++;j--;
        }
        if(i==j){
            if(capA<plants[i] && capB<plants[j])
            refillA++;
        }
      
        return  refillA+refillB;
    }
}
