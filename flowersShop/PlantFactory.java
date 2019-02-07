package epam.flowersShop;

import epam.flowersShop.enums.Color;
import epam.flowersShop.enums.Growing;

public class PlantFactory {
    public static Plant getPlant(String name) {
        if (name.equalsIgnoreCase("Tulip")) {
            return new Flower(1, "Tulip", Color.RED, false, Growing.GARDEN, 13, 30);
        }
        else if (name.equalsIgnoreCase("Cactus")) {
            return new Flower(2, "Cactus", Color.GREEN, true, Growing.GARDEN, 6, 50);
        }
        else if (name.equalsIgnoreCase("Rose")) {
            return new Flower(3, "Rose", Color.RED, false, Growing.POT, 14, 40);
        }
        else if (name.equalsIgnoreCase("Marigold")) {
            return new Flower(4, "Marigold", Color.JADE, false, Growing.GARDEN, 5, 65);
        }
        else if (name.equalsIgnoreCase("Carnation")) {
            return new Flower(5, "Carnation", Color.MARSALA, false, Growing.GARDEN, 10, 25);
        }
        else if (name.equalsIgnoreCase("Palm")) {
            return new Flower(6, "Palm", Color.RED, false, Growing.POT, 14, 40);
        }
        return null;
    }
}