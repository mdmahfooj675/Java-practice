package pattern_problem;

public class problem_24 {
    public static void main(String[] args) {
        
        // print the number pattern
        System.out.println("pattern printing 24-> printing a pattern  using numbers");
        int z = 5;
        for(int row = 1 ; row <= z ; row++){
            for(int col = 1 ; col <= z-row ; col++){
                System.out.print("  ");
            }
            for(int col = 1 ; col <= 2*row-1 ; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }

        System.out.println("code ended.....");
    }
    
}
