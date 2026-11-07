package pattern_problem;

public class problem_10 {
    public static void main(String[] args) {
        
        // print the pattern

        System.out.println("pattern printing 10-> print the amazing pattern");

        int h = 4;

        for(int row = 1 ; row <= h ; row++){

            for(int col = 1 ; col <= 6 ; col++){
                if (row == 1 || row == h){
                    System.out.print("* ");
                } else {

                    if (col == 1 || col == 6) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                 
                    }
                }
            }


            System.out.println();
        }


        System.out.println("code ended....");
    }

    
}