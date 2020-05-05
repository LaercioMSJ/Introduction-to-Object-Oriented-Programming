public class Circle extends Shape {

    //Properties
    private double radius;

    //Constructor Method
    public Circle(int dimensions, String color, double radius) {
        super(dimensions, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    //Actions Methods
    public String outputDetails(int counter) {
        String area = String.format("%.2f", getArea());
        return "Circle " + counter + " - Dimensions: " + this.dimensions + "\tColor: " + this.color + "\tRadius: "
                + this.radius + "\tArea: " + area;
    }
}