package pizza;

public class PizzaDeal {
    double deal(Pizza p){
        return p.get_price()/p.get_shape().getArea();
    }
    boolean betterDeal(Pizza p1, Pizza p2){
        return deal(p1) < deal(p2);
    }
}
