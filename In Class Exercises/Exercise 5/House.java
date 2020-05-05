public class House {

    //Properties
    double width;
    double length;
    int buildYear;
    String color;

    //Constructor Method
    public House(double width, double length, int buildYear, String color) {
        this.width = width;
        this.length = length;
        this.buildYear = buildYear;
        this.color = color;
    }

    //Actions Methods
    public void printTotalArea() {
        double totalArea = width * length;
        System.out.printf("The total square footage of the house is %.2f", (totalArea));
    }

    public void printBuildYearAndColor() {
        System.out.printf("\nThe house was built in " + buildYear + " and its color is " + color);
    }

}
