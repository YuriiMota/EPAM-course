package epam.flowersShop;

import epam.flowersShop.enums.Color;
import epam.flowersShop.enums.Growing;
import epam.mexico.Localization;

public  class Tree extends Plant {
    public Tree(int id, String name, Color color, Boolean isNative, Growing growing, int hight, float price) {
        super(id, name, color, isNative, growing, hight, price);
    }
}
