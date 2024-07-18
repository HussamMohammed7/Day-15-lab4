import java.text.DecimalFormat;

public class Traingle extends Shape{

    private double base , height ;


    public Traingle(double base, double height) {
        this.base = base;
        this.height = height;
    }



    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculateCircumference() {
        double c = Math.sqrt((base * base) + (height * height));
        return base + height + c;
    }



    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Triangle: \n" +
                "Base: " + df.format(base) + "\n" +
                "Height: " + df.format(height) + "\n" +
                "Area: " + df.format(calculateArea()) + "\n" +
                "Perimeter: " + df.format(calculateCircumference());
    }






}
