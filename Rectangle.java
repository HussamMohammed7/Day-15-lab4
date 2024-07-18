import java.text.DecimalFormat;

public class Rectangle extends Shape{

   private double width , height;

    public Rectangle (){

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Rectangle: \n" +
                "Width: " + df.format(width) + "\n" +
                "Height: " + df.format(height) + "\n" +
                "Area: " + df.format(calculateArea()) + "\n" +
                "Perimeter : " + df.format(calculateCircumference());
    }
}
