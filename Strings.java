import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //in java string is a combination of characters
        //it has a seperate class called "String"
        //a string can be declared in two ways
        String a= "Pranav";
        String A = new String("Pranav");
        System.out.println(a+" "+A);
        //Strings in java are immutable
        //every time you modify the string a new string is generated and the original is not modified
        //thsi is for the reason of thread safety,caching and security
        //how to take Sting input
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name");
        String name= sc.next();//takes only single token of the input
        System.out.println("your name is "+name);
        String job =sc.nextLine();//this takes input as line and not as token
        //token means a single word in the given input
        //how to find the length of the string
        String Boy ="Pranav";
        System.out.println(Boy.length());//prints the length of the  string
        // if we observe we find the parenthesis for length indicating that it is a fuction under the class called String
        //In arrays its a prperty and not a fuction as in strings
        //how to join two strings:concatenation
        
        String e="Pranav";
        String b= "is";
        String c="a";
        String d="Good Boy";
        String Total= e+b+c+d;
        System.out.println(Total);
        //to find the character at a certain index we use charAt function
        String Dog= "Goledie";
        System.out.println(Dog.charAt(3));

        



    }
    
}
