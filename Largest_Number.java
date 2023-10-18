public class Largest_Number {
    public static void main(String[] args) {
        int a[]= {23,34,56,12,22,33,45};
        int highest= Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>highest){
                highest= a[i];
            }
        }
        System.out.println("the highest number is "+ highest);
    }
}
