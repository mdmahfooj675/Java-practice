package pattern_problem;

public class problem_08 {
    public static void main(String[] args) {

        // print the pyramid pattern
        
        System.out.println("pattern printing 8-> pyramid pattern ");

        int a = 5;

        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= a - row; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("pattern printed successfully.....");
        
    }
    
}
