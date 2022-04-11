package day38_Inheritance.Shape;

public class Square extends ShapeTask {

    double s;

    public Square(String name, double s) {
        super(name);
        this.s = s;
    }

    public double area(){
        double area = s*s;
        return area;
    }

    public double perimeter(){
        double perimeter = 4*s;
        return perimeter;
    }

    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", s=" + s +
                ", area=" + area() +
                ", perimeter=" +perimeter() +
                '}';
    }
}
