package Array_java;

public class problem_statment_05 {
    public static void main(String[] args) {
        
        // creat an array and print their multiply of thr elements
        System.out.println("question -> creat an array and print the multiplication of the string");

        int arr[] = {10,20,30,-40,50};

        int s = arr.length;
        int multiply = 1;


        for(int i = 0 ; i <= s-1 ; i++){
            System.out.println("elements are : " + arr[i]);
            multiply *= arr[i];
        }


        System.out.println("multiplication of the elements : " + multiply);
        System.out.println("code ended.....");


    }

    
}
