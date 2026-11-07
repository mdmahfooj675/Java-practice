package pattern_problem;

public class problem_01 {
    public static void main(String[] args) {
        
        // print the square pattern 
        System.out.println("pattern printing 1 -> print the square pattern ");

        for(int row = 1 ; row <= 5 ; row++) {
            for(int col = 1 ; col <= 5 ; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        System.out.println("code ended....");

    } 
}