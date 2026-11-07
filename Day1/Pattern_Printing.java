import java.util.Scanner;

public class Pattern_Printing {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // print the alphabet pattern
        System.out.println("pattern printing 25-> printing a pattern  using alphabet");
        int md = 5;

        for(int row = 1 ; row <= md ; row++){
            for(int col = 1 ; col <= md-row ; col++){
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

        // print the number pattern
        System.out.println("pattern printing 24-> printing a pattern  using numbers");
        int z = 5;
        for(int row = 1 ; row <= z ; row++){
            for(int col = 1 ; col <= z-row ; col++){
                System.out.print("  ");
            }
            for(int col = 1 ; col <= 2*row-1 ; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }

        System.out.println("code ended.....");

        // print the pattern
        System.out.println("pattern printing 23-> print the pattern");
        int y = 4;
        for(int row = 1 ; row <= y ; row++){
            for(int col = 1 ; col <= y-row ; col++){
                System.out.print("  ");
            }
            for(int col = 1 ; col <= row ; col++) {
                System.out.print(col + " ");
            }
                int row_value = row;
                int decrement_row_value = row - 1;
                for(int col = 1 ; col <= row - 1 ; col++){
                    System.out.print(decrement_row_value + " ");
                    decrement_row_value--;
            }
            System.out.println();
        }
        System.out.println("code ended....");

        // print the pattern using stars
        System.out.println("pattern printing 22-> print the pattern");
        int x = 5;
        for(int row = 1 ; row <= x ; row++){
            for(int col = 1 ; col<= row - 1 ; col++){  // for print spaces
                System.out.print("  ");
            }
            for(int col = 1 ; col <= 2*x-2*row+1 ; col++){ // for print stars
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 1; row <= x; row++) {
            if (row == 1){
                continue;
            }
            for (int col = 1; col <= x - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("code ended....");

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

        // print the combination of tringles and spaces using loops
        System.out.println("pattern printing 17-> print the combination of stars and spaces pattern");
        int s = 5;
        for(int row = 1 ; row <= s ; row++){ // part 1 print the tringle
            for(int col = 1 ; col<=row ; col++){
                System.out.print("* ");
            }
            for(int col = 1 ; col <= 2*(s-row) ; col++){ // part 2 print the spaces
                System.out.print("  ");
            }
            for(int col = 1 ; col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = 1 ; row <= s ; row++){
            for(int col = 1 ; col <= s-row+1 ; col++){
                System.out.print("* ");
            }
            for(int col = 1 ; col <= 2*(row-1) ; col++){
                System.out.print("  ");
            }
            for(int col = 1 ; col <= s-row+1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("code ended....");

        // print the pattern of combination of hollow pyramid and hollow inverted pyramid
        System.out.println("pattern printing 16-> print the hollow pyramid and hollow inverted pyramid pattern");

        int r = 5;
        for(int row = 1 ; row <= r ; row++){
            for(int col = 1 ; col <= r-row ; col++){
                System.out.print("  ");
            }
            if (row == 1 ){
                for(int col = 1 ; col <= 2*row-1 ; col ++){
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");

                for (int col = 1 ; col <= 2*row-3 ; col++){
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = 1 ; row <= (r-1) ; row++){
            for(int col = 1 ; col <= row ; col++) {
                System.out.print("  ");
            }
            if (row == (r - 1)){
                System.out.print("* ");
            } else {
                System.out.print("* ");

                for(int col = 1 ; col <= 2*(r-row)-3 ; col++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

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

        // print the combination of pyramid and inverted pyramid
        System.out.println("pattern printing 14-> print the pattern");
        int o = 5;
        for(int row = 1 ; row <= o ; row++){
            for(int col = 1 ; col<= o - row ; col++){  // for print spaces
                System.out.print("  ");
            }
            for(int col = 1 ; col <= 2*row-1 ; col++){ // for print stars
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row = 1 ; row <= o ; row++){
            if (row == 1){
                continue;
            }
            for(int col = 1 ; col<= row - 1 ; col++){  // for print spaces
                System.out.print("  ");
            }
            for(int col = 1 ; col <= 2*o-2*row+1 ; col++){ // for print stars
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("code ended....");


        // print the hollow pyramid pattern
        System.out.println("pattern printing 13-> print the amazing hollow pyramid pattern");
        int l = 5;
        for(int row = 1 ; row <= l ; row++){
            for(int col = 1 ; col <= l-row ; col++){
                System.out.print("  ");
            }
            if (row == 1 || row == l){
                for(int col = 1 ; col <= 2*row-1 ; col ++){
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");

                for (int col = 1 ; col <= 2*row-3 ; col++){
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("code ended....");

        // print the hollow right angle tringle pattern
        System.out.println("pattern printing 12-> print the amazing hollow right angle tringle pattern");
        int k = 8;
        for(int row = 1 ; row <= k ; row++){
          if (row == 1 || row == 2 || row == k){
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

        // print the hollow tringle pattern
        System.out.println("pattern printing 11-> print the amazing hollow rectangle pattern");
        int g = 4;
        for (int row = 1; row <= g; row++) {
            for (int col = 1; col <= 6; col++) {
                if (row == 1 || row == g || col == 1 || col == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("code ended....");

        // print the pattern
        System.out.println("pattern printing 10-> print the amazing pattern");
        int h = 4;
        for(int row = 1 ; row <= h ; row++){
            for(int col = 1 ; col <= 6 ; col++){
                if (row == 1 || row == h){
                    System.out.print("* ");
                } else {
                    if (col == 1 || col == 6) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("code ended....");

        // print the  pattern
        System.out.println("pattern printing 9-> print the pattern");
        int f = 5;
        for(int row = 1 ; row <= f ; row++){
            for(int col = 1 ; col<= row - 1 ; col++){  // for print spaces
                System.out.print("  ");
            }
            for(int col = 1 ; col <= 2*f-2*row+1 ; col++){ // for print stars
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("code ended....");

        System.out.println("pattern printing 8-> pyramid pattern ");
        int q = 5;
        for (int row = 1; row <= q; row++) {
            for (int col = 1; col <= q - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // print the pyramid pattern
        System.out.println("pattern printing 7-> print the pyramid pattern");
        int e = 5;
        for(int row = 1 ; row <= e ; row++){
            for(int col = 1 ; col<= e - row ; col++){  // for print spaces
                System.out.print("  ");
            }
            for(int col = 1 ; col <= 2*row-1 ; col++){ // for print stars
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("code ended....");

        // print the tringle based pattern
        System.out.println("pattern printing 6-> print the pattern");
        int d = 5;
        for(int row = 1 ; row <= d ; row++){
            for(int col = 1 ; col <= d-row+1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("code ended....");


        // print the  pattern
        System.out.println("pattern printing 5-> print the pattern");
        int c = 5;
        for(int row = 1 ; row <= c ; row++){
            for(int col = 1 ; col<= c- row ; col++){  // for print spaces
                System.out.print(" ");
            }
            for(int col = 1 ; col <= c ; col++){ // for print stars
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("code ended....");

        // print the tringle based pattern
        System.out.println("pattern printing 4-> print the tringle based pattern");
        int b = 5;
        for(int row = 1 ; row <= b ; row++){
            for(int col = 1 ; col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("code ended....");

        // print  the pattern of perfect square
        System.out.println("pattern printing 3-> printing a perfect square");
        int a = 6;
        for(int row = 1 ; row <= a ; row++){
            for(int col = 1 ; col <= a ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("code ended.....");

        // print  the pattern of perfect rectangle₹
        System.out.println("pattern printing 2-> printing a perfect rectangle");
        for(int m = 1 ; m <= 3 ; m++){
            for(int n = 1 ; n <= 5 ; n++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("code ended.....");

        // print the simple square
        System.out.println("pattern printing 1-> printing a square");
        for(int i = 1 ; i <= 5 ; i++) {
            for(int j = 1 ; j <= 5 ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        System.out.println("code ended.....");

    }
}