package day35_Ensapsulation.encapsulation;

public class Circle {

    private double radius;
    public static double pi;

    public Circle(double radius) {
        setRadius(radius);
    }

    static {
        pi = 3.14;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if (radius<=0){
            return;
        }
        this.radius = radius;
    }

    public double calcArea(){
        double area = getRadius()*pi*getRadius();
        return area;
    }

    public double calcPerimeter(){
        double perimeter = 2*pi*getRadius();
        return perimeter;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +", "+
                "area=" + calcArea() +", "+
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
