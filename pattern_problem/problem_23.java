package pattern_problem;

public class problem_23 {
    public static void main(String[] args) {
        
        // print the pattern

        System.out.println("pattern printing 23-> print the pattern");

        int y = 4;
        for(int row = 1 ; row <= y ; row++){
            for(int col = 1 ; col <= y-row ; col++){
                System.out.print("  ");
            }

            for(int col = 1 ; col <= row ; col++) {
                System.out.print(col + " ");
            }
                int row_value = row;
                int decrement_row_value = row - 1;
                for(int col = 1 ; col <= row - 1 ; col++){
                    System.out.print(decrement_row_value + " ");
                    decrement_row_value--;
            }
            
            System.out.println();
        }

        System.out.println("code ended....");
    }
    
}
