package day38_Inheritance.Shape;

public class ShapeObject {

    public static void main(String[] args) {

        Circle circle = new Circle("daire", 5);

        Rectangle rectangle = new Rectangle("Dikdortgen", 10,15);

        Square square = new Square("Kare", 9);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(square.area());

        System.out.println(circle.perimeter());
        System.out.println(rectangle.perimeter());
        System.out.println(square.perimeter());

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);


    }
}
