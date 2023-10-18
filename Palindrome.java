public class Palindrome {
    public static void main(String[] args) {
        String a ="LEVEL";
        String b ="racecar";
        String C = "Pranav";
        //for each loop cant work for strings it works only for arrays.
        Check_Palindrome(a);
         Check_Palindrome(b);
        Check_Palindrome(C);

    }
    public static void Check_Palindrome(String b){
        Boolean Res = true;
        for(int i=0;i<=(b.length()/2);i++){
            if(b.charAt(i)!=b.charAt(b.length()-i-1)){
            Res= false;
        }   
    }
    if(Res){
            System.out.println("given string is a palindrome");
        }
        else{
            System.out.println("given string is not a palindrome");
        }
}
}
