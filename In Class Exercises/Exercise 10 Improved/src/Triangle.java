public class Triangle extends Shape {

    //Properties
    private double height;
    private double base;

    //Constructor Method
    public Triangle(int dimensions, String color, double height, double base) {
        super(dimensions, color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return (this.height * this.base) / 2;
    }

    //Actions Methods
    public String outputDetails(int counter) {
        String area = String.format("%.2f", getArea());
        return "Triangle " + counter + " - Dimensions: " + this.dimensions + "\tColor: " + this.color + "\tHeight: "
                + this.height + "\tBase: " + this.base + "\tArea: " + area;
    }
}
