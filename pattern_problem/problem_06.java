package pattern_problem;

public class problem_06 {
    public static void main(String[] args) {

        // print the tringle based pattern

        System.out.println("\"pattern printing 6 -> print the tringle based patttern");

        int a = 5;

        for (int row = 1 ; row <= a ; row++) {
            for (int col = 1 ; col <= a-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("code ended successfully....");
        
    }
    
}