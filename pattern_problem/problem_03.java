package pattern_problem;

public class problem_03 {
    public static void main(String[] args) {

        // print the perfect square pattern
        
        System.out.println("\"pattern printing 3 -> print the perfect square pattern");

        int a = 6;

        for (int row = 1 ; row <= a ; row++) {
            for (int col = 1 ; col <= a ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("pattern printing successfully...");
    }  
}