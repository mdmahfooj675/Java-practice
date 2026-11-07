package pattern_problem;

public class problem_05 {
    public static void main(String[] args) {
        
        // print the pattern

        System.out.println("\"pattern printing 5 -> print the pattern");

        int a = 5;

        for (int row = 1 ; row <= a ; row++) {
            for (int col = 1 ; col <= a-row ; col++) {
                System.out.print(" ");
            }
            for (int col = 1 ; col <= a ; col++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }

        System.out.println("pattern printed successfully...");
    }
    
}