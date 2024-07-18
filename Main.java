//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



           Circle circle = new Circle(30);
           Traingle traingle = new Traingle(4,5);
           Rectangle rect = new Rectangle(7,3);
        System.out.println("*********************************");

        System.out.println(circle);
        System.out.println("*********************************");
        circle.setRadius(10);
        System.out.println(circle.getRadius());
        System.out.println(circle);
        System.out.println("*********************************");


        System.out.println(traingle);
        System.out.println("*********************************");

        traingle.setBase(6);
        traingle.setHeight(8);
        System.out.println(traingle.getBase());
        System.out.println(traingle.getHeight());
        System.out.println(traingle);
        System.out.println("*********************************");

        System.out.println(rect);
        rect.setWidth(10);
        rect.setHeight(10);

        System.out.println("*********************************");
        System.out.println(rect.getWidth());
        System.out.println(rect.getHeight());
        System.out.println(rect);





    }
}