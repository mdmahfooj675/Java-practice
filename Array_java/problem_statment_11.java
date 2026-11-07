package Array_java;

public class problem_statment_11 {
    public static void main(String[] args) {
        

        // print the multiplication of the elements present in the 2D array
        System.out.println("question -> print the multiplication of the elements present in the 2D array");

        int [][] arr = {{1,2,3,4}, {6,7,5,3} };
        int Mult = 1;

        for(int ROW = 0 ; ROW < arr.length ; ROW++){
            for(int COL = 0 ; COL < arr[ROW].length ; COL++){
                int mult  = arr[ROW][COL];
                Mult *= mult;
            }
        }

        System.out.println("multiplication is : " + Mult);
        System.out.println("code ended.....");


    }
}    
