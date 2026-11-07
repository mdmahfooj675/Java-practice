package Array_java;

public class problem_statment_08 {
    public static void main(String[] args) {
        
        // traversal or tagged array
        System.out.println("question -> print the traversal or tagged array");

        int [][] arr = {
                {1,2,3,4},
                {67,75,3,2,6,7,0},
                {5,7,3,1,4,}
        };
        for(int rowIndex = 0 ; rowIndex <= arr.length -1 ; rowIndex++){
            for(int colIndex = 0 ; colIndex <= arr[rowIndex].length -1 ; colIndex++){
                System.out.print(arr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }

        System.out.println("code ended.....");

    }
    
}
