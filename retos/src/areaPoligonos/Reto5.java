package areaPoligonos;

public class Reto5 {
    public static void main(String[] args) {
        area(new Triangle(10.0, 5.0));
        area(new Rectangle(5.0, 7.0));
        area(new Square(4.0));
    }

    public static double area(IPolygon IPolygon) {
        IPolygon.printArea();
        return IPolygon.area();
    }

}
interface IPolygon {
    double area();
    void printArea();
}

class Triangle implements IPolygon {
    private final double base;
    private final double height;

    public Triangle(Double base, Double height){
        this.base=base;
        this.height=height;
    }

    @Override
    public double area() {
        return (base*height)/2;
    }

    @Override
    public void printArea() {
        System.out.println("El area del triangulo es "+area());
    }
}

class Rectangle implements IPolygon {
    private final double length;
    private final double width;

    public Rectangle(Double length, Double width){
        this.length=length;
        this.width =width;
    }

    @Override
    public double area() {
        return (length* width);
    }

    @Override
    public void printArea() {
        System.out.println("El area del rectangulo es "+area());
    }
}
class Square implements IPolygon {
    private final double side;


    public Square(Double side){
        this.side=side;

    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public void printArea() {
        System.out.println("El area del cuadrado es "+area());
    }
}