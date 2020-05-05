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
    public void outputDetails() {
        double area = getArea();
        System.out.printf("Circle - Dimensions: " + this.dimensions + "\tColor: " + this.color + "\tRadius: "
                + this.radius + "\tArea: %.2f\n", (area));
    }
}