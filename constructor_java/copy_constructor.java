package constructor_java;

// below code are works on the copy constructor

class Student {
    // attributes
    public int id;
    public int age;
    public String name;
    public int number_of_subject;

    //parametrised constructor (naam class jaisa hi)
    public Student(int id , int age , String name , int number_of_subject) {
        System.out.println("Student parametrised constructor called...");
        this.id = id;
        this.age = age;
        this.name = name;
        this.number_of_subject = number_of_subject;
    }

    // copy constructor (naam class jaisa hi)
    public Student(Student source_object) { // source_object -> student A
        System.out.println("Student copy constructor called...");
        this.id = source_object.id;
        this.age = source_object.age;
        this.name = source_object.name;
        this.number_of_subject = source_object.number_of_subject;
    }

    // methods
    public void study() {
        System.out.println(name + " is studying");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void bunk() {
        System.out.println(name + " is bunking");
    }
}

public class copy_constructor {
    public static void main(String[] args) {
        Student A = new Student(1068 , 19 , "code help" , 7);
        Student B = new Student(A);

        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.number_of_subject);

        B.sleep();
        B.bunk();
        B.study();

        System.out.println("coded execution successfully.....");
  
    }
}
