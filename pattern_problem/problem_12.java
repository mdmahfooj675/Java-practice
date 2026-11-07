package pattern_problem;

public class problem_12 {
    public static void main(String[] args) {
        
        // print the hollow right angle tringle pattern

        System.out.println("pattern printing 12-> print the amazing hollow right angle tringle pattern");

        int a = 8;

        for(int row = 1 ; row <= a ; row++){
          if (row == 1 || row == 2 || row == a){
              for(int col = 1 ; col <= row ; col++) {
                  System.out.print("* ");
              }
         } else {
              System.out.print("* ");

              for(int col = 1 ; col <= (row-2); col++){
                  System.out.print("  ");
              }
              System.out.print("* ");
          }

          System.out.println();
        }


        System.out.println("code ended....");
    }

    
}
