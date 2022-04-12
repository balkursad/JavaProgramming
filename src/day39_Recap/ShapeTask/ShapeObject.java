package day39_Recap.ShapeTask;

public class ShapeObject {

    public static void main(String[] args) {

        Square square = new Square(5);

        Rectangle rectangle = new Rectangle(10,20);

        Circle circle = new Circle(15);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(square.area());

        System.out.println(circle.perimeter());
        System.out.println(rectangle.perimeter());
        System.out.println(square.perimeter());

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        rectangle.setLength(25);
        rectangle.setWidth(30);
        System.out.println(rectangle.area());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getName());
        System.out.println(circle.pi);




    }
}
