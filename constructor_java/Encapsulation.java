package constructor_java;

class Mac {
    public int id;
    private int age;
    public String name;
    public int number_of_subject;
    

    // we can access this by adding some another layer 
    // we can not access directly
    public int get_age() { 
        return this.age;
    }


    // extra layer of authentication 
    public void get_age(int a) {
        if (age < 100)
            this.age = a;
        return;
    
    }

    public Mac(int id , int age , String name , int number_of_subject , String gf) {
        System.out.println("student parametrised constructor called...");

        this.id = id;
        this.age = age;
        this.name = name;
        this.number_of_subject = number_of_subject;
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void bunk() {
        System.out.println(name + " is bunking");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        
        Mac A = new Mac(1068 , 19 , "macbook" , 6 , "tina");

        System.out.println(A.get_age());

        A.get_age(553);

        System.out.println(A.get_age());

        System.out.println(A.name);
        System.out.println(A.get_age());
        System.out.println(A.id);
        System.out.println(A.number_of_subject);
     

        A.study();
        A.sleep();
        A.bunk();
        A.eat();


    }
    
}
