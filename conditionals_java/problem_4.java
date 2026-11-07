package conditionals_java;
import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // problem set 4 -> take age input and print either eligible to vote or not
        
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");
        }

        System.out.println("code execution successfully.....");
    }
    
}
