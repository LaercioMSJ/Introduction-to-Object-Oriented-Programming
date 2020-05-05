public class Circle {

    // Properties
    String colour;
    double radius;


    // Default Constructor Method
    public Circle() {
        this.colour = "green";
        this.radius = 2;
    }


    // Second Overloaded Constructor Method
    public Circle(double radius) {
        this.colour = "green";
        this.radius = radius;
    }


    // Third Overloaded Constructor Method
    public Circle(String colour, double radius) {
        this.colour = colour;
        this.radius = radius;
    }


    // Actions Methods
    public void getter() {
        System.out.printf("Radius =  $%.2f, Colour = " + this.colour, (this.radius));
    }


    public void getArea() {
        System.out.printf("Radius =  $%.2f, Colour = " + this.colour, (this.radius));
    }


    public void toString() {
        System.out.printf("Radius =  $%.2f, Colour = " + this.colour, (this.radius));
    }
}
