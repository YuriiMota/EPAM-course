package epam.flowersShop.Decorator;

import epam.flowersShop.Order;
import epam.flowersShop.enums.Delivery;

public class DeliveryDecorator extends FlowersDecorator {
    private final Order order;
    Delivery delivery;

    public DeliveryDecorator(Order order, Delivery delivery) {
        this.order = order;
        this.delivery = delivery;
    }

    @Override
    public float getPrice() {
        return order.getPrice() *delivery.getPrice();
    }
}
