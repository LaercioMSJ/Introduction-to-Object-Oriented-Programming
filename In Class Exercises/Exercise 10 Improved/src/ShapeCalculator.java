import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeCalculator extends JFrame {

    // Count number of objects inserted
    public int cntCircle = 0;
    public int cntTriangle = 0;
    public int cntRectangle = 0;

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

        // All fields (labels and textFields) start invisible
        lblRadius.setVisible(false);
        txtFieldRadius.setVisible(false);

        lblBase.setVisible(false);
        txtFieldBase.setVisible(false);
        lblHeight.setVisible(false);
        txtFieldHeight.setVisible(false);

        lblWidth.setVisible(false);
        txtFieldWidth.setVisible(false);
        lblLength.setVisible(false);
        txtFieldLength.setVisible(false);


        // Create radioCircle JRadioButton
        JRadioButton radioCircle = new JRadioButton("Circle");
        radioCircle.setBounds(50, 50, 100, 25);
        radioCircle.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                lblRadius.setVisible(true);
                txtFieldRadius.setVisible(true);

                lblBase.setVisible(false);
                txtFieldBase.setVisible(false);
                lblHeight.setVisible(false);
                txtFieldHeight.setVisible(false);

                lblWidth.setVisible(false);
                txtFieldWidth.setVisible(false);
                lblLength.setVisible(false);
                txtFieldLength.setVisible(false);

            }
        });
        add(radioCircle);


        // Create radioTriangle JRadioButton
        JRadioButton radioTriangle = new JRadioButton("Triangle");
        radioTriangle.setBounds(50, 100, 100, 25);
        radioTriangle.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                lblRadius.setVisible(false);
                txtFieldRadius.setVisible(false);

                lblBase.setVisible(true);
                txtFieldBase.setVisible(true);
                lblHeight.setVisible(true);
                txtFieldHeight.setVisible(true);

                lblWidth.setVisible(false);
                txtFieldWidth.setVisible(false);
                lblLength.setVisible(false);
                txtFieldLength.setVisible(false);

            }
        });
        add(radioTriangle);


        // Create radioRectangle JRadioButton
        JRadioButton radioRectangle = new JRadioButton("Rectangle");
        radioRectangle.setBounds(50, 150, 100, 25);
        radioRectangle.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                lblRadius.setVisible(false);
                txtFieldRadius.setVisible(false);

                lblBase.setVisible(false);
                txtFieldBase.setVisible(false);
                lblHeight.setVisible(false);
                txtFieldHeight.setVisible(false);

                lblWidth.setVisible(true);
                txtFieldWidth.setVisible(true);
                lblLength.setVisible(true);
                txtFieldLength.setVisible(true);

            }
        });
        add(radioRectangle);


        ButtonGroup group = new ButtonGroup();
        group.add(radioCircle);
        group.add(radioTriangle);
        group.add(radioRectangle);


        // Create txtDetails JTextArea
        JTextArea txtDetails = new JTextArea("");
        txtDetails.setEditable(false);
        
        // Create scrollPane JScrollPane and adds txtDetails JTextArea to it
        JScrollPane scrollPane = new JScrollPane(txtDetails);
        scrollPane.setBounds(20, 200, 550, 150);
        add(scrollPane);


        // Create btnCalculator JButton
        JButton btnCalculator = new JButton ("Calculate");
        btnCalculator.setBounds(220, 370, 100, 25);
        btnCalculator.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (radioCircle.isSelected()) {

                    String radiusStr = txtFieldRadius.getText();
                    double radiusDouble = Double.parseDouble(radiusStr);

                    Circle circle = new Circle(2, "Blue", radiusDouble);

                    cntCircle += 1;
                    txtDetails.append(circle.outputDetails(cntCircle) + "\n");

                    String result = String.format("%.2f", circle.getArea());

                    JOptionPane.showMessageDialog(null, "The area of the circle is " + result,"Circle Area", JOptionPane.INFORMATION_MESSAGE);

                }

                if (radioTriangle.isSelected()) {

                    String baseStr = txtFieldBase.getText();
                    String heightStr = txtFieldHeight.getText();

                    double baseDouble = Double.parseDouble(baseStr);
                    double heightDouble = Double.parseDouble(heightStr);

                    Triangle triangle = new Triangle(2, "Blue", heightDouble, baseDouble);

                    cntTriangle += 1;
                    txtDetails.append(triangle.outputDetails(cntTriangle) + "\n");

                    String result = String.format("%.2f", triangle.getArea());

                    JOptionPane.showMessageDialog(null, "The area of the triangle is " + result,"Triangle Area", JOptionPane.INFORMATION_MESSAGE);

                }

                if (radioRectangle.isSelected()) {

                    String widthStr = txtFieldWidth.getText();
                    String lengthStr = txtFieldLength.getText();

                    double widthDouble = Double.parseDouble(widthStr);
                    double lengthDouble = Double.parseDouble(lengthStr);

                    Square square = new Square(2, "Blue", lengthDouble, widthDouble);

                    cntRectangle += 1;
                    txtDetails.append(square.outputDetails(cntRectangle) + "\n");

                    String result = String.format("%.2f", square.getArea());

                    JOptionPane.showMessageDialog(null, "The area of the rectangle is " + result,"Rectangle Area", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        });
        add(btnCalculator);


        // Set title, background, size, layout of window, make visible to JFrame
        setTitle("Shape Calculator");
        setSize(600, 500);                                    //600 width and 400 height
        setLayout(null);                                                    //using no layout managers
        setVisible(true);                                                   //making the frame visible
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }

}
