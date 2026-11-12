package vehicle;

public class main {
    public static void main (String[] args) {

        // this is the car child class
        car c = new car("BMW" , "M4" , 4 , 2 , "automatic");

        c.start_engine();
        c.start_Ac();
        c.stop_engine();

        // this is the motercycle child class
        moterCycle m = new moterCycle("splendor" , "Xline", 2, "U", "soft");

        m.start_engine();
        m.wheelie();
        m.stop_engine();

        
    } 
}