package Array_java;
import java.util.Scanner;

public class problem_statment_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // creat an array and print their elements without using for each loop
        System.out.println("question -> creat an array and print the elements without using loop");
        int mrr[] = {10,20,30,40,50};
        int m = mrr.length;
        for(int i = 0 ; i <= m-1 ; i++){
            System.out.println("elements are : " + mrr[i]);
        }
        System.out.println("code ended.....");

        // how to take input elements in the array
        int arr[] = new int[5];
        int size = arr.length;

        for(int i = 0 ; i <= size-1 ; i++){// this loop helps me to take input the elements form user
            System.out.println("provide the elements in index: " + i);
            arr[i] = sc.nextInt();
        }

        for(int val : arr){  // this loop helps me to print the elements which is input by the usesr
            System.out.println("elements in the array is : " + val);
        }

        System.out.println("code ended....");
        
    }
    
}
