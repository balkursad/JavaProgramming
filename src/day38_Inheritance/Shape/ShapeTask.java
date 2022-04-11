package day38_Inheritance.Shape;

public class ShapeTask {

    public String name;

    public ShapeTask(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public String toString() {
        return "ShapeTask{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
