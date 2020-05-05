import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //Create a square object (it's an Shape)
        //Note that we pass all 4 values to the Square constructor,
        //even though only 2 of the values are defined within that class
        Square square = new Square(2, "Red", 1.5, 1.8);

        Circle circle = new Circle(2, "Blue", 2.5);

        Triangle triangle = new Triangle(2, "Green", 3.5, 1.2);

        //Square inherits getArea from Shape, which is where getArea method is defined.
        // outputDetails method calls getArea method
        square.outputDetails();

        circle.outputDetails();

        triangle.outputDetails();


        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ShapeCalculator calculator = new ShapeCalculator();
                    calculator.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}