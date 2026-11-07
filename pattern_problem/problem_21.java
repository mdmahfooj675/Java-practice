package pattern_problem;

public class problem_21 {
    public static void main(String[] args) {
        
        // print  the pattern of count alphabet tringle
        
        System.out.println("pattern printing 21-> printing tringle using count numbers");

        int w = 5;
        for(int row = 1 ; row <= w ; row++){
            for(int col = 1 ; col <= row ; col++){
                int a = w-col;
                int b = 'A';
                int ans = a + b;
                char final_ans = (char)ans;
                System.out.print(final_ans + " ");
            }
            System.out.println();
        }

        System.out.println("code ended.....");
    }
    
}
