package pattern_problem;

public class problem_18 {
    public static void main(String[] args) {
        
        // print  the pattern of number tringle

        System.out.println("pattern printing 18-> printing a tringle using numbers");
        
        int t = 5;
        for(int row = 1 ; row <= t ; row++){
            for(int col = 1 ; col <= row ; col++){
                System.out.print(col + "  ");
            }
            System.out.println();
        }

        System.out.println("code ended.....");
    }
    
}
