package day38_Inheritance.Shape;

public class Rectangle extends ShapeTask {

    double l, w;

    public Rectangle(String name, double l, double w) {
        super(name);
        this.l = l;
        this.w = w;
    }

    public double area (){
        double area = l*w;
        return area;
    }

    public double perimeter(){
        double perimeter = 2*(w+l);
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "l=" + l +
                ", w=" + w +
                ", name='" + name + '\'' +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
