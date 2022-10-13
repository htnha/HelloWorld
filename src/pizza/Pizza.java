package pizza;

public class Pizza implements Comparable<Pizza>{
    private double _price;
    private iShape _shape;

    public Pizza(double price, iShape shape) {
        this._price = price;
        this._shape = shape;
    }

    public double get_price() {
        return _price;
    }

    public iShape get_shape() {
        return _shape;
    }

    @Override
    public String toString() {
        PizzaDeal pizzaDeal = new PizzaDeal();
        return "Pizza{" +
                "_price=" + _price +
                ", _shape=" + _shape +
                ", deal=" + pizzaDeal.deal(this) +
                '}';
    }


    @Override
    public int compareTo(Pizza p) {
        PizzaDeal deal = new PizzaDeal();
        return deal.betterDeal(this, p)? 1:-1;
    }
}
