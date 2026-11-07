package pattern_problem;

public class problem_15 {
    public static void main(String[] args) {

        // print the pattern in the combination of pyramid and inverted pyramid

        System.out.println("pattern printing 15-> print the pyramid and inverted pyramid pattern");
        
        int p = 5;
        for (int row = 1; row <= p; row++) {
            for (int col = 1; col <= p - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("@ ");
            }
            System.out.println();
        }

        for (int row = 2; row <= p ; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * p - 2 * row + 1; col++) {
                System.out.print("@ ");
            }
            System.out.println();
        }

        System.out.println("code ended.....");
    }
    
}
