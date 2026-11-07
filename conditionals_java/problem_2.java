package conditionals_java;

public class problem_2 {
    public static void main(String[] args) {
        
        // code based on the nested if
        
        boolean has_subscription = true;
        int solved_problem = 220;

        if (has_subscription) {
            if (solved_problem >= 200) {
                System.out.println("unlock advance sheet");
            } else {
                System.out.println("practise more question");
            }

        } else {
            System.out.println("upgrade to premium");
        }
    }
    
}
