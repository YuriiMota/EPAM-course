package epam.mexico;

public class Flower {
    private String kind;
    private Color color;
    private Localization localization;
    private Growing growing;
    private int hight;
    private float price;


    public Flower(String kind, Color color, Localization localization, Growing growing, int hight, float price) {
        this.kind = kind;
        this.color = color;
        this.localization = localization;
        this.growing = growing;
        this.hight = hight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "kind='" + kind + '\'' +
                ", color=" + color +
                ", localization=" + localization +
                ", growing=" + growing +
                ", hight=" + hight +
                ", price=" + price +
                '}';
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Localization getLocalization() {
        return localization;
    }

    public void setLocalization(Localization localization) {
        this.localization = localization;
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
}
