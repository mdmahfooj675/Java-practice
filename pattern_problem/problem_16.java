package pattern_problem;

public class problem_16 {
    public static void main(String[] args) {
        // print the pattern of combination of hollow pyramid and hollow inverted pyramid
        System.out.println("pattern printing 16-> print the hollow pyramid and hollow inverted pyramid pattern");

        int r = 5;
        for(int row = 1 ; row <= r ; row++){
            for(int col = 1 ; col <= r-row ; col++){
                System.out.print("  ");
            }
            if (row == 1 ){
                for(int col = 1 ; col <= 2*row-1 ; col ++){
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");

                for (int col = 1 ; col <= 2*row-3 ; col++){
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = 1 ; row <= (r-1) ; row++){
            for(int col = 1 ; col <= row ; col++) {
                System.out.print("  ");
            }
            if (row == (r - 1)){
                System.out.print("* ");
            } else {
                System.out.print("* ");

                for(int col = 1 ; col <= 2*(r-row)-3 ; col++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
