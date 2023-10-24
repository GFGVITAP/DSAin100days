public class countSetBits {
    public static int setBits(int N) {
        int setbit=0;
        do{
            if(N%2==1){
                setbit=setbit+1;
                
            }
            N=N/2;
        }while(N>=1);
        return setbit;
    }
    public static void main(String[] args) {
 
        System.out.println(setBits(8));


    }
}
