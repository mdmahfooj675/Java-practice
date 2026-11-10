package constructor_java;

// simple code based on the copy constructor
class Student {

    // Attributes 
    public int id;
    public int age;
    public String name;
    public int number_of_subject;

    // default constructor
    public Student() {
        System.out.println("student default constructor called...");
    }

    // methods of the copy constructor
    public void study() {
        System.out.println(name + "is studying");
    }

    public void sleep() {
        System.out.println(name + "is sleeping");
    }

    public void bunk() {
        System.out.println(name + "is bunking");
    }

}

public class default_constructor {
    public static void main(String [] args) {
        Student A = new Student();

        A.id = 251068;
        A.age = 19;
        A.name = "code help";
        A.number_of_subject = 5;

        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.number_of_subject);

        A.study();
        A.sleep();
        A.bunk();
        
        System.out.println("code ended....");
    }
}
