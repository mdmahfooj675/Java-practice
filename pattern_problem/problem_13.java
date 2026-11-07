package pattern_problem;

public class problem_13 {
    public static void main(String[] args) {
        
        // print the hollow pyramid pattern

        System.out.println("pattern printing 13-> print the amazing hollow pyramid pattern");

        int a = 5;

        for(int row = 1 ; row <= a ; row++){
            for(int col = 1 ; col <= a-row ; col++){
                System.out.print("  ");
            }

            if (row == 1 || row == a){
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

        System.out.println("code ended....");
    }
    
}
