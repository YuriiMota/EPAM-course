package epam.flowersShop.enums;

public enum Delivery {
    UkrPoshta(1.2f),
    NovaPoshta(1.25f),
    CourierDelivery(1.3f);
    float price;

    Delivery(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
