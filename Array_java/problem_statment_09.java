package Array_java;
import java.util.Scanner;

public class problem_statment_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // taking input in 2D array and print them
        System.out.println("question -> taking 2D array as input and print their elements");

        int [][] arr = new int[3][4];

        for(int x = 0 ; x <= arr.length -1 ; x++){  // for taking input form user
            for(int y = 0 ; y <= arr[x].length-1 ; y++){
                System.out.println("provide the element for row : " + x + "and columns : " + y);
                arr[x][y] = sc.nextInt();
            }
        }

        for(int rowIndex = 0 ; rowIndex <= arr.length -1 ; rowIndex++){ // for printing
            for(int colIndex = 0 ; colIndex <= arr[rowIndex].length -1 ; colIndex++){
                System.out.print(arr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }

        System.out.println("code ended.....");
    }
    
}
