package epam.flowersShop;

import epam.flowersShop.enums.Color;
import epam.flowersShop.enums.Growing;

public abstract class Plant implements Order {
    private int id;
    private String name;
    private Color color;
    private Boolean isNative;
    private Growing growing;
    private int hight;
    private float price;

    public Plant(int id, String name, Color color, Boolean isNative, Growing growing, int hight, float price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isNative = isNative;
        this.growing = growing;
        this.hight = hight;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Boolean getNative() {
        return isNative;
    }

    public void setNative(Boolean aNative) {
        isNative = aNative;
    }

    public Growing getGrowing() {
        return growing;
    }

    public void setGrowing(Growing growing) {
        this.growing = growing;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", isNative=" + isNative +
                ", growing=" + growing +
                ", hight=" + hight +
                ", price=" + price +
                '}';
    }
}
