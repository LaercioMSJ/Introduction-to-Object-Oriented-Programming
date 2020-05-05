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
    public String outputDetails(int counter) {
        String area = String.format("%.2f", getArea());
        return "Square " + counter + " - Dimensions: " + this.dimensions + "\tColor: " + this.color + "\tHeight: "
                + this.height + "\tWidth: " + this.width + "\tArea: " + area;
    }
}
