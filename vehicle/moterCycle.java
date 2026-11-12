package vehicle;

public class moterCycle extends Vehicle {
    public String handle_bar_style;
    public String suspension_type;

    moterCycle(String name , String model , int number_of_tyres , String handle_bar_style , String suspension_type) {

        super(name , model , number_of_tyres);
        this.handle_bar_style = handle_bar_style;
        this.suspension_type = suspension_type;

    }

    public void wheelie() {
        System.out.println("moter cycle is doing wheelieeeee! " + name);
        
    }
    
}