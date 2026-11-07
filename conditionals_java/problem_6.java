package conditionals_java;
import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // problem set 6(a) -> take lower case as input from user and print them in upper case
        System.out.println("question 6-> take lower case as input from user and print them in upper case");

        System.out.println("Enter any thing you want in upper case (string) : ");
        String word2 = sc.nextLine();

        System.out.println("in small letters : " + word2.toLowerCase());
        System.out.println("code ended.....");

        

        // problem set 6(b) -> take lower case as input from user and print them in upper case 
        System.out.println("question 6(b) -> take lower case as input from user and print them in upper case");

        System.out.println("Enter any thing you want in lower case (string) : ");
        String word = sc.nextLine();

        System.out.println("in capital letters : " + word.toUpperCase());
        System.out.println("code ended....");
    }
    
}
