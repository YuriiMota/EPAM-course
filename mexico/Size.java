package epam.mexico;

public enum Size {
    S(20),
    M(30),
    L(50),
    XL(100);

    private int price;

    Size(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
