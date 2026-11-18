package polymorphism_solving;

public class calculator {
    
    // method of adding two integers
    int add (int a , int b) {
        return a + b;
    }

    // overloading method to add three integers
    int add (int a , int b , int c) {
        return a + b + c;
    }

    // again overloading method to add different data members
    double add (int a , double b , float c , int d) {
        return a + b + c + d;
    }
}