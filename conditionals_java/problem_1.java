package conditionals_java;

public class problem_1 {
    public static void main(String[] args) {

         // code based on the if elif else
        int accuracy = 78;

        if (accuracy >= 90) {
            System.out.println("you have excellent accuracy");
        } else if (accuracy >= 75) {
            System.out.println("you have good accuracy");
        } else if (accuracy >= 60) {
            System.out.println("you have average accuracy");
        } else {
            System.out.println("you need to improvement");
        }

        System.out.println("code ended successfully.....");


    }
       
}