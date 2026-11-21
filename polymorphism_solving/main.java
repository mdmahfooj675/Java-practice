package polymorphism_solving;

public class main {
    public static void main(String[] args) {
        
        // creat a object of the calculator class
        calculator c = new calculator();

        System.out.println("printing the addition values...");

        System.out.println("addition of the two integers : " + c.add(5 , 10));
        System.out.println("addition of the two integers : " + c.add(5 , 10 , 15));
        System.out.println("addition of the two integers : " + c.add(5 , 10.5 , 5.6f , 10));

        // runtime polymorphhism
        circle C = new circle();
        C.draw();

        System.out.println("----------------------------");
        
        rect r = new rect();
        r.draw();

        System.out.println("code execution successfully....");
    }
}