package Array_java;

public class problem_statment_10 {
    public static void main(String[] args) {
        
        // print the sum of the elements present in the 2D array
        System.out.println("question -> print the sum of the elements present in the 2D array");

        int [][] arr = {{1,2,3,4}, {6,7,5,3} };
        int sum = 0;

        for(int ROW = 0 ; ROW < arr.length ; ROW++){
            for(int COL = 0 ; COL < arr[ROW].length ; COL++){
                int addition  = arr[ROW][COL];
                sum += addition;
            }
        }

        System.out.println("sum is : " + sum);
        System.out.println("code ended.....");

    }
}
