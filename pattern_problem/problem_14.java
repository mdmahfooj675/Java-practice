package pattern_problem;

public class problem_14 {
    public static void main(String[] args) {
        
        // print the combination of pyramid and inverted pyramid

        System.out.println("pattern printing 14-> print the pattern");
        
        int o = 5;
        for(int row = 1 ; row <= o ; row++){
            for(int col = 1 ; col<= o - row ; col++){  // for print spaces
                System.out.print("  ");
            }
            for(int col = 1 ; col <= 2*row-1 ; col++){ // for print stars
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row = 1 ; row <= o ; row++){
            if (row == 1){
                continue;
            }
            for(int col = 1 ; col<= row - 1 ; col++){  // for print spaces
                System.out.print("  ");
            }
            for(int col = 1 ; col <= 2*o-2*row+1 ; col++){ // for print stars
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("code ended....");
    }
    
}
