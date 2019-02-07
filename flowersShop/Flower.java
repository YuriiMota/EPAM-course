package epam.flowersShop;

import epam.flowersShop.enums.Color;
import epam.flowersShop.enums.Growing;

public class Flower extends Plant{
    public Flower(int id, String name, Color color, Boolean isNative, Growing growing, int hight, float price) {
        super(id, name, color, isNative, growing, hight, price);

    }
}
