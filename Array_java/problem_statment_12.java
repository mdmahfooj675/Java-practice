package Array_java;

public class problem_statment_12 {
    public static void main(String[] args) {
        
        // to find the minimum value in the given 2d array
        System.out.println("question -> find the minimum value in the 2D array");

        int arr [][] = {{1,33,22},{45,65,66}};
        int minValue = arr[0][0];

        for(int a = 0 ; a < arr.length ; a++){
            for(int b = 0 ; b < arr[a].length ; b++){
                if (arr[a][b] > minValue){
                    minValue = arr[a][b];
                }
            }
        }
        System.out.println("your miniimum value : " + minValue);
        System.out.println("code ended....");

    }
    
}
