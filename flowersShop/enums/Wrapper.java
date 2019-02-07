package epam.flowersShop.enums;

public enum Wrapper {
    PAPER(5), CARDBOARD(10),POLYETHYLENE(20);
    int price;

    Wrapper(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
