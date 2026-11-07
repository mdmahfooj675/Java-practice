package Array_java;

public class problem_statment_07 {
    public static void main(String[] args) {
        
        // creat an array and find the maximum value
        System.out.println("question -> creat an array and find the maximum value");

        int arr[] = {10,20,30,40,50};
        int u = arr.length;
        int min_value = arr[0];

        for(int i = 0 ; i <= u-1 ; i++){
            if (arr[i] < min_value){
                min_value = arr[i];
            }
        }

        System.out.println("minimum value in the given array : " + min_value);
        System.out.println("code ended.....");

    }
    
}
