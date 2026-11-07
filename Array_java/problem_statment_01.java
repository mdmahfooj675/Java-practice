package Array_java;

public class problem_statment_01 {
    public static void main(String[] args) {

        System.out.println("question -> based on the array");

        int brr[] = {10,20,30,40,50}; // initalisation of an array

        // accessing the array elements using for each loop
        for(int val : brr) {
            System.out.println("elements are : " + val);
        }

        // accessing array elements using for loop
        int n = brr.length;
        for(int index = 0 ; index <= n-1 ; index++){
            System.out.println("ements in array : " + brr[index]);
        }

        // how to access the any element present in the element
        System.out.println("value at 0 index : " + brr[0]);
        System.out.println("value at 1 index : " + brr[1]);
        System.out.println("value at 2 index : " + brr[2]);
        System.out.println("value at 3 index : " + brr[3]);
        System.out.println("value at 4 index : " + brr[4]);

        System.out.println("code ended aucceaafully.....");
    }

}
