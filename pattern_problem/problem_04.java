package pattern_problem;

public class problem_04 {
    public static void main(String[] args) {
        
        // print the tringle based pattern

        System.out.println("\"pattern printing 4 -> print the tringle based pattern");

        int a = 5;

        for (int row = 1 ; row <= a ; row++) {
            for (int col = 1 ; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("pattern printed successfully.....");
    }
    
}
