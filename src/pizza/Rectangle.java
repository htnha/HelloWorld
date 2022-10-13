package pizza;

public class Rectangle implements iShape{
    double _width;
    double _length;

    public Rectangle(double width, double length) {
        this._width = width;
        this._length = length;
    }


    @Override
    public double getArea() {
        return this._length*this._width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "_width=" + _width +
                ", _length=" + _length +
                '}';
    }
}
