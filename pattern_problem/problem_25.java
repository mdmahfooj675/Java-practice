package pattern_problem;

public class problem_25 {
    public static void main(String[] args) {
        
        // print the alphabet pattern

        System.out.println("pattern printing 25-> printing a pattern  using alphabet");
        int a = 5;

        for(int row = 1 ; row <= a ; row++){
            for(int col = 1 ; col <= a-row ; col++){
                System.out.print("  ");
            }
            
            for(int col = 1 ; col <= row ; col++){
                int row_vlaue = col;
                int col_value = 'A' - 1;
                int ans = row_vlaue + col_value;
                char finalAns = (char)ans;

                System.out.print(finalAns + " ");
            }

            char alphabet = (char)(row + 'A' - 2);
            for(int col = 1 ; col <= row-1 ; col++){
                System.out.print(alphabet + " ");
                alphabet--;
            }

            System.out.println();
        }

        System.out.println("code ended....");
    }
}
