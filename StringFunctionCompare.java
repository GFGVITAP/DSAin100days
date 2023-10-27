public class StringFunctionCompare {
    public static void main(String[] args) {
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");
        if(s1==s2){
            System.out.println("Strings s1 and s2 are equal");
        }
        else{
            System.out.println("Strings s1 and s2 are not equal");
        }
        if(s1==s3){
            System.out.println("Strings s1 and s3 are equal");
        }
        else{
            System.out.println("Strings s1 and s3 are not equal");
        }
        // --------------------------------
        // //the output :
        // Strings s1 and s2 are equal
        // Strings s1 and s3 are not equal 
        // this is the output because when we dont use the new  keyword both s1 and s2 act as pointers and they point to the data "tony" stored at a 
        // certain (location)
        // Here basically both s1 and s2 are pointing to same location so result is true;
        // But for s1 and s3 it is false because new keyword creates a new location and stores data
        // Key Point to observe is that:
        // "==" sign compares that locaation address and not the data int
        // Inorder to compare the data irrespective of location we use ".equals()" function.
        // --------------------------------
        if(s1.equals(s3))
        System.out.println("Strings s1 and s3 are equal");
        else
         System.out.println("Strings s1 and s3 are not equal");
    }
}
