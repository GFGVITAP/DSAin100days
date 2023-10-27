public class CompareToFunction {
    public static void main(String[] args) {
        //the copare to functin in java compares the strings in lexicographical order
        //the output will be 3 cases
        // 1.zero :- string 1 is equal to string2
        // 2.negative :- string 1 is less than string2
        // 3.positive :- string 1 is greater than string2
        String a ="Pranav";
        String b= "Arun";
        System.out.println(a.compareTo(b));
        //here the output will be positive
        //Another method where the strings comparison is done by ignoring thier case is 
        System.out.println(a.compareToIgnoreCase(b));


    }
    
}
