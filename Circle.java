import java.text.DecimalFormat;

public class Circle extends Shape{

    private double radius ;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    @Override
    public double calculateArea() {
        return (radius*radius)*Math.PI;
    }

    @Override
    public double calculateCircumference() {
        return Math.PI*2*radius;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Circle: \n" +
                "Radius: " + df.format(radius) + "\n" +
                "Area: " + df.format(calculateArea()) + "\n" +
                "Circumference: " + df.format(calculateCircumference());
    }
}
