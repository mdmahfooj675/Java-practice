package conditionals_java;
import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // problem set 5-> take input five subject marks and print their average
        
        System.out.println("Enter your first subject marks ; ");
        int physics = sc.nextInt();

        System.out.println("Enter your second subject marks ; ");
        int chem = sc.nextInt();

        System.out.println("Enter your third subject marks ; ");
        int math = sc.nextInt();

        System.out.println("Enter your foruth subject marks ; ");
        int english = sc.nextInt();

        System.out.println("Enter your fifth subject marks ; ");
        int eco = sc.nextInt();

        int average = (physics + chem + math + english + eco) / 5;
        System.out.println("your average marks is : " + average);

    }
    
}
