import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ShapeCalculator extends JFrame {

    // Constructor
    public ShapeCalculator() {

        // Circle
        // Create lblRadius JLabel
        JLabel lblRadius = new JLabel("Radius:");
        lblRadius.setBounds(200, 50, 100, 25);
        add(lblRadius);

        // Creates lblEnterName JTextField
        JTextField txtFieldRadius = new JTextField("");
        txtFieldRadius.setBounds(250, 50, 100, 25);
        add(txtFieldRadius);

        // Create radioCircle JRadioButton
        JRadioButton radioCircle = new JRadioButton("Circle");
        radioCircle.setBounds(50, 50, 100, 25);
        radioCircle.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String radiusStr = txtFieldRadius.getText();
                double radiusDouble = Double.parseDouble(radiusStr);

                Circle circle = new Circle(2, "Blue", radiusDouble);

                String result = String.format("%.2f", circle.getArea());

                JOptionPane.showMessageDialog(null, result,"Circle Area", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        add(radioCircle);


        // Triangle
        // Create lblBase JLabel
        JLabel lblBase = new JLabel("Base:");
        lblBase.setBounds(200, 100, 100, 25);
        add(lblBase);

        // Creates txtFieldBase JTextField
        JTextField txtFieldBase = new JTextField("");
        txtFieldBase.setBounds(250, 100, 100, 25);
        add(txtFieldBase);

        // Create lblHeight JLabel
        JLabel lblHeight = new JLabel("Height:");
        lblHeight.setBounds(370, 100, 100, 25);
        add(lblHeight);

        // Creates txtFieldHeight JTextField
        JTextField txtFieldHeight = new JTextField("");
        txtFieldHeight.setBounds(420, 100, 100, 25);
        add(txtFieldHeight);

        // Create radioTriangle JRadioButton
        JRadioButton radioTriangle = new JRadioButton("Triangle");
        radioTriangle.setBounds(50, 100, 100, 25);
        radioTriangle.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String baseStr = txtFieldBase.getText();
                String heightStr = txtFieldHeight.getText();

                double baseDouble = Double.parseDouble(baseStr);
                double heightDouble = Double.parseDouble(heightStr);

                Triangle triangle = new Triangle(2, "Blue", heightDouble, baseDouble);

                String result = String.format("%.2f", triangle.getArea());

                JOptionPane.showMessageDialog(null, result,"Triangle Area", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        add(radioTriangle);


        // Rectangle
        // Create lblWidth JLabel
        JLabel lblWidth = new JLabel("Width:");
        lblWidth.setBounds(200, 150, 100, 25);
        add(lblWidth);

        // Creates txtFieldWidth JTextField
        JTextField txtFieldWidth = new JTextField("");
        txtFieldWidth.setBounds(250, 150, 100, 25);
        add(txtFieldWidth);

        // Create lblLength JLabel
        JLabel lblLength = new JLabel("Length:");
        lblLength.setBounds(370, 150, 100, 25);
        add(lblLength);

        // Creates txtFieldLength JTextField
        JTextField txtFieldLength = new JTextField("");
        txtFieldLength.setBounds(420, 150, 100, 25);
        add(txtFieldLength);

        // Create radioRectangle JRadioButton
        JRadioButton radioRectangle = new JRadioButton("Rectangle");
        radioRectangle.setBounds(50, 150, 100, 25);
        radioRectangle.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String widthStr = txtFieldWidth.getText();
                String lengthStr = txtFieldLength.getText();

                double widthDouble = Double.parseDouble(widthStr);
                double lengthDouble = Double.parseDouble(lengthStr);

                Square square = new Square(2, "Blue", lengthDouble, widthDouble);

                String result = String.format("%.2f", square.getArea());

                JOptionPane.showMessageDialog(null, result,"Rectangle Area", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        add(radioRectangle);

        ButtonGroup group = new ButtonGroup();
        group.add(radioCircle);
        group.add(radioTriangle);
        group.add(radioRectangle);

        // Set title, background, size, layout of window, make visible to JFrame
        setTitle("Shape Calculator");
        setSize(600, 400);                                                  //800 width and 800 height
        setLayout(null);                                                    //using no layout managers
        setVisible(true);                                                   //making the frame visible
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);                                               //making the frame visible
    }

}
