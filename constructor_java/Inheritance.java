package constructor_java;
import java.util.Scanner;


// parent or base class that is vehicle 
class Vehicle { 

    public String name;
    public String model;
    public int number_of_tyres;


    // this is the default constructor
    public Vehicle() {
    this.name = " ";
    this.model = " ";
    this.number_of_tyres = -1;
    }

    // this is the parametrised constructor
    Vehicle(String name , String model , int number_of_tyres) {
    this.name = name;
    this.model = model;
    this.number_of_tyres = number_of_tyres;

    }

    void start_engine() {
        System.out.println("engine is statring of " + name + " " + model);
    }

    void stop_engine() {
        System.out.println("engine is statring of " + name + " " + model);
    }
     
}

// car is the child class of the parent class that is vehicle 
class car extends Vehicle {
    public int number_of_doors;
    public String transmission_type;

    car(String name , String model , int number_of_tyres , int numebr_of_doors , String transmission_type) {
        super(name , model , number_of_tyres);
        this.number_of_doors = numebr_of_doors;
        this.transmission_type = transmission_type;

    }

    public void start_ac() {
        System.out.println("AC is starting : " + name);
    }

}

// moter cycle is the child class of the parent class that is vehicle
class moterCycle extends Vehicle {
    public String handle_bar_style;
    public String suspension_type;

    moterCycle(String name , String model , int number_of_tyres , String handle_bar_style , String suspension_type) {
        super(name , model , number_of_tyres);
        this.handle_bar_style = handle_bar_style;
        this.suspension_type = suspension_type;
    }

    public void wheelie() {
        System.out.println("moter cycle is wheelieeeeeee! : " + name);
    }

}


public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Today we are learning the Innheritance in object oriented in java...");

        // example of vechiles using inheritance in object oriented in java

        // example of car child class
        car c = new car("maruti", "800", 4, 4, "automatic");
    
        c.start_engine();
        c.start_ac();
        c.stop_engine();

        // example of moter cycle child class
        moterCycle m = new moterCycle("splendor", "Xline", 2, "U", "soft");

        m.start_engine();
        m.wheelie();
        m.stop_engine();

    }
}
