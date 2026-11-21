package polymorphism_solving;

public class main {
    public static void main(String[] args) {
        
        // creat a object of the calculator class
        calculator c = new calculator();

        System.out.println("printing the addition values...");

        System.out.println("addition of the two integers : " + c.add(5 , 10));
        System.out.println("addition of the two integers : " + c.add(5 , 10 , 15));
        System.out.println("addition of the two integers : " + c.add(5 , 10.5 , 5.6f , 10));

        System.out.println("----------------------------");

        // runtime polymorphhism
        circle C = new circle();

        System.out.println("run time polymorphism / dynamic method dispatch or upcasting");
        do_draw(new shape());
        System.out.println("----------------------------");

        System.out.println("run time polymorphism / dynamic method dispatch or upcasting");
        do_draw(C);
        System.out.println("----------------------------");

        System.out.println("function overloading calling...");
        C.draw();
        System.out.println("----------------------------");
        
        // runtime polymorphism
        rect r = new rect();

        System.out.println("run time polymorphism / dynamic mathod dispatch or upcasting");
        do_draw(new shape());
        System.out.println("----------------------------");

        System.out.println("run time polymorphism / dynamic method dispatch or upcasting");
        do_draw(r);
        System.out.println("----------------------------");

        System.out.println("function over loading calling....");
        r.draw();
        System.out.println("----------------------------");

        // creating new shape
        System.out.println("----------------------------");
        shape s = new shape();
        do_draw(s);

        System.out.println("code execution successfully....");
    }

    public static void do_draw(shape s) {
        s.draw();
    }
}