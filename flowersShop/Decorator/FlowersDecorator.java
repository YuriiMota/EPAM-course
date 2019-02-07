package epam.flowersShop.Decorator;

import epam.flowersShop.Order;


public abstract class FlowersDecorator implements Order {
    private float price;
    @Override
    public String getName() {
        return "Bouquet";
    }


}
