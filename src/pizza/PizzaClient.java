package pizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PizzaClient {
    void run(){
        Circle circle1 = new Circle(20);
        Circle circle2 = new Circle(30);
        Rectangle rectangle1 = new Rectangle(20, 30);
        Rectangle rectangle2 = new Rectangle(15, 30);
        Pizza p1 = new Pizza(99, circle1);
        Pizza p2 = new Pizza(120, circle2);
        Pizza p3 = new Pizza(110, rectangle1);
        Pizza p4 = new Pizza(100, rectangle2);
        List<Pizza> pizzaList = new ArrayList<Pizza>();
        pizzaList.add(p1);
        pizzaList.add(p2);
        pizzaList.add(p3);
        pizzaList.add(p4);
        Collections.sort(pizzaList);
        for ( Pizza p: pizzaList
             ) {
            System.out.println(p);
        }
    }
    public static void main(String[]args){
        PizzaClient pizzaClient = new PizzaClient();
        pizzaClient.run();
    }
}
