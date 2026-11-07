package conditionals_java;
import java.util.Scanner;

public class problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // take input five subject marks , drop smallest one and calculate avg of top 4 subjects
        System.out.println("question 7-> take marks of 5 subject as input and print the avg of top 4 subject");


        System.out.println("Enter your first subject marks ; ");
        double first = sc.nextDouble();

        System.out.println("Enter your second subject marks ; ");
        double second = sc.nextDouble();

        System.out.println("Enter your third subject marks ; ");
        double third = sc.nextDouble();

        System.out.println("Enter your foruth subject marks ; ");
        double fourth = sc.nextDouble();

        System.out.println("Enter your fifth subject marks ; ");
        double fifth = sc.nextDouble();

        double min = first;
        if (first < min) {
            min = first;
        }  if (second < min) {
            min = second;
        }  if (third < min) {
            min = third;
        }  if (fourth < min) {
            min = fourth;
        }  if (fifth < min) {
            min = fifth;
        }

        double sum_subject = (first + second + third + fourth + fifth);
        System.out.println(sum_subject);

        double avg_subject = (sum_subject - min ) / 4;
        System.out.println("average of top four subject is : " + avg_subject);

    }
    
}
