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
    public void outputDetails() {
        double area = getArea();
        System.out.printf("Triangle - Dimensions: " + this.dimensions + "\tColor: " + this.color + "\tHeight: "
                + this.height + "\tBase: " + this.base + "\tArea: %.2f\n", (area));
    }
}
