package Array_java;

public class problem_statment_03 {
    public static void main(String[] args) {
        
        // creat an array and print their sum of thr elements
        System.out.println("question -> creat an array and print the sum of the elements");

        int arr[] = {10,20,30,40,50};
        int o = arr.length;
        int sum = 0;

        for(int i = 0 ; i <= o-1 ; i++){
            System.out.println("elements are : " + arr[i]);
            sum = sum + arr[i];
        }

        System.out.println("sum of the elements : " + sum);
        System.out.println("code ended.....");

        System.out.println("code ended....");
    }
    
}
