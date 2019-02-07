package epam.flowersShop.enums;

public enum Pot {
    S(20),
    M(30),
    L(40),
    XL(70);
 int price;

    Pot(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
