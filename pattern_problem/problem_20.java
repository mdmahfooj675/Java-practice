package pattern_problem;

public class problem_20 {
    public static void main(String[] args) {
        
        // print  the pattern of alphabet tringle

        System.out.println("pattern printing 20-> printing a tringle using alphabet");

        int v = 5;
        for(int row = 1 ; row <= v ; row++){
            for(int col = 1 ; col <= row ; col++){
                int a  = col;
                int b = ('A' - 1);
                int ans = a + b;
                char final_ans = (char)ans;
                System.out.print(final_ans + "  ");
            }
            
            System.out.println();
        }

        System.out.println("code ended.....");
    }
    
}
