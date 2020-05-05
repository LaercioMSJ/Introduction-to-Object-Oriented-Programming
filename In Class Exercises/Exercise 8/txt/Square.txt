public class Square extends Shape {

    //Properties
    private double height;
    private double width;

    //Constructor Method
    public Square(int dimensions, String color, double height, double width) {
        super(dimensions, color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    //Actions Methods
    public void outputDetails() {
        double area = getArea();
        System.out.printf("Square - Dimensions: " + this.dimensions + "\tColor: " + this.color + "\tHeight: "
                + this.height + "\tWidth: " + this.width + "\tArea: %.2f\n", (area));
    }
}
