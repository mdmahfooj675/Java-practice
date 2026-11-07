package pattern_problem;

public class problem_17 {
    public static void main(String[] args) {
        
        // print the combination of tringles and spaces using loops

        System.out.println("pattern printing 17-> print the combination of stars and spaces pattern");
        int s = 5;
        for(int row = 1 ; row <= s ; row++){ // part 1 print the tringle
            for(int col = 1 ; col<=row ; col++){
                System.out.print("* ");
            }
            for(int col = 1 ; col <= 2*(s-row) ; col++){ // part 2 print the spaces
                System.out.print("  ");
            }
            for(int col = 1 ; col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int row = 1 ; row <= s ; row++){
            for(int col = 1 ; col <= s-row+1 ; col++){
                System.out.print("* ");
            }
            for(int col = 1 ; col <= 2*(row-1) ; col++){
                System.out.print("  ");
            }
            for(int col = 1 ; col <= s-row+1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("code ended....");
    }
    
}
