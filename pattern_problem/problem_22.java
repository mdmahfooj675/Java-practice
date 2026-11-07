package pattern_problem;

public class problem_22 {
    public static void main(String[] args) {
        
        // print the pattern using stars

        System.out.println("pattern printing 22-> print the pattern");
        
        int x = 5;
        for(int row = 1 ; row <= x ; row++){
            for(int col = 1 ; col<= row - 1 ; col++){  // for print spaces
                System.out.print("  ");
            }
            for(int col = 1 ; col <= 2*x-2*row+1 ; col++){ // for print stars
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 1; row <= x; row++) {
            if (row == 1){
                continue;
            }
            for (int col = 1; col <= x - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("code ended....");
    }
    
}
