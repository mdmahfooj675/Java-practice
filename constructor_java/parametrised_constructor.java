package constructor_java;

// below code are works on the parametrised constructor

class Student {
    
    // attributes
    public int id;
    public int age;
    public String name;
    public int number_of_subject;

    // parametrised constructor 
    public Student(int id , int age , String name , int number_of_subject) {
        System.out.println("Student parametrised constructor called...");
        this.id = id;
        this.age = age;
        this.name = name;
        this.number_of_subject = number_of_subject;
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

public class parametrised_constructor {
    public static void main(String[] args) {
        Student A = new Student(1068 , 19 , "code help" , 7);

        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.number_of_subject);

        A.sleep();
        A.bunk();
        A.study();

        System.out.println("code ended successfully...");
  
    }
}

