package Array_java;

public class problem_statment_04 {
    public static void main(String[] args) {
        
       // print the sum of the elements present in the array
       System.out.println("question -> print the sum of the elements present in the array");


        int arr[] = {1, 34,34,54,44,55};
        int add = 0;
        int p = arr.length;

        for(int i = 0 ; i <= p-1 ; i++){
            int value = arr[i];
            add = add + value;
        }

        System.out.println("sum of the elements : " + add);
        System.out.println("code ended.....");

    }
    
}
