package day38_Inheritance.Shape;

public class Circle extends ShapeTask {

    double r ;
    static double pi = 3.14;


    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    public double area(){
        double area = r*r*pi;
        return area;
    }


    public double perimeter() {
        double perimeter = 2*pi*r;
        return perimeter;
    }

    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
