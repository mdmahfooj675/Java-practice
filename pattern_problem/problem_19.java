package pattern_problem;

public class problem_19 {
    public static void main(String[] args) {
        
        // print  the pattern of count number tringle
        System.out.println("pattern printing 19-> printing tringle using count numbers");

        int u = 5;
        int count = 1;
        
        for(int row = 1 ; row <= u ; row++){
            for(int col = 1 ; col <= row ; col++){
                System.out.print(count + "  ");
                count++;
            }
            System.out.println();
        }

        System.out.println("code ended.....");

    }
    
}
