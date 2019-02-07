package epam.flowersShop.Decorator;

import epam.flowersShop.Order;
import epam.flowersShop.enums.Pot;

public class PotDecorate extends FlowersDecorator {
    private final Order order;
    Pot pot;

    public PotDecorate(Order order, Pot pot) {
        this.order = order;
        this.pot = pot;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public float getPrice() {
        return order.getPrice()+pot.getPrice();
    }
}
