package epam.flowersShop.Decorator;


import epam.flowersShop.Order;


public class Bouquet extends FlowersDecorator {
    private final Order order;
    float price;


    public Bouquet(Order order, float price) {
        this.order = order;
        this.price = price;

    }

    @Override
    public float getPrice() {
        return order.getPrice() + price;
    }
}
