package Array_java;

public class problem_statment_06 {
    public static void main(String[] args) {
        
        // creat an array and find the maximum value
        System.out.println("question -> creat an array and find the maximum value");

        int arr[] = {10,20,30,-40,50};
        int t = arr.length;
        int max_value = arr[0];

        for(int i = 0 ; i <= t-1 ; i++){
            if (arr[i] > max_value){
                max_value = arr[i];
            }
        }

        System.out.println("maximum value in the given array : " + max_value);
        System.out.println("code ended.....");


    }
    
}
