package pattern_problem;

public class problem_07 {
    public static void main(String[] args) {
        
        // print the pyramid pattern
        System.out.println("pattern printing 7-> print the pyramid pattern");

        int a = 5;

        for(int row = 1 ; row <= a ; row++){

            for(int col = 1 ; col<= a - row ; col++){  // for print spaces
                System.out.print("  ");
            }

            for(int col = 1 ; col <= 2*row-1 ; col++){ // for print stars
                System.out.print("* ");
            }

            System.out.println();
        }
        
        System.out.println("code ended....");
        
    }
    
}
