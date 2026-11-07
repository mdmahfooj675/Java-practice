package pattern_problem;

public class problem_09 {
    public static void main(String[] args) {
        
        // print the  pattern

        System.out.println("pattern printing 9-> print the pattern");

        int a = 5;

        for(int row = 1 ; row <= a ; row++){
            for(int col = 1 ; col<= row - 1 ; col++){  // for print spaces
                System.out.print("  ");
            }

            for(int col = 1 ; col <= 2*a-2*row+1 ; col++){ // for print stars
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("pattern printed successfully....");
        
    }
    
}
