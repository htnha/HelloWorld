package pizza;

public class Circle implements iShape {
    private double _radius;

    public Circle(double radius) {
        this._radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this._radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "_radius=" + _radius +
                '}';
    }
}
