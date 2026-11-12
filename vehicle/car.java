package vehicle;

// car is the first child class of the parent class that is Vehicle

public class car extends Vehicle {
    public int number_of_door;
    public String transmission_type;

    car(String name , String model , int number_of_tyres , int number_of_door , String transmission_type) {

        super(name , model , number_of_tyres);
        this.number_of_door = number_of_door;
        this.transmission_type = transmission_type;

    }

    public void start_Ac() {
        System.out.println("AC is starting of " + name);

    }

}