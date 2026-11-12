package vehicle;

// this is the parent or base class that is vehicle

class Vehicle {
    public String name;
    public String model;
    public int number_of_tyres;

    // Default constructor
    public Vehicle() {
        System.out.println("vehicle default constructor is called.....");
        this.name = " ";
        this.model = " ";
        this.number_of_tyres = -1;
    }

    // parametrised constructor
    Vehicle(String name , String model , int number_of_tyres) {
        System.out.println("vehicle parametrised constructor is called.....");
        this.name = name;
        this.model = model;
        this.number_of_tyres = number_of_tyres;
    }

    // method or behaviours of the vehicles
    void start_engine() {
        System.out.println("engine is starting of " + name + " " + model);
    }

    void stop_engine() {
        System.out.println("engine is stoping of " + name + " " + model);
    }
}
