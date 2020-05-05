//Shape is the superclass
public abstract class Shape {

    int dimensions;
    String color;

    //Default constructor (no params)
    public Shape() {}

    //Constructor with params
    public Shape (int dimensions, String color) {
        this.dimensions = dimensions;
        this.color = color;
    }

    //This method is inherited by all subclasses
    public abstract double getArea();
}