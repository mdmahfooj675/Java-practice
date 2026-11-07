package pattern_problem;

public class problem_11 {
    public static void main(String[] args) {
        
        // print the hollow tringle pattern

        System.out.println("pattern printing 11-> print the amazing hollow rectangle pattern");

        int a = 4;

        for (int row = 1; row <= a; row++) {

            for (int col = 1; col <= 6; col++) {

                if (row == 1 || row == a || col == 1 || col == 6) {
                    System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println("code ended....");
    }
    
}
