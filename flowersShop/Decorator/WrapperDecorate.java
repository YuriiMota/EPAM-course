package epam.flowersShop.Decorator;

import epam.flowersShop.Order;
import epam.flowersShop.enums.Wrapper;

public class WrapperDecorate extends FlowersDecorator {
    private final Order order;
    Wrapper wrapper;

    public WrapperDecorate(Order order, Wrapper wrapper) {
        this.order = order;
        this.wrapper = wrapper;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public float getPrice() {
        return order.getPrice()+wrapper.getPrice();
    }
}
