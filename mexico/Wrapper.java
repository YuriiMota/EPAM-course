package epam.mexico;

public class Wrapper {
    private int id;
    private Size size;
    private Color color;
    private float price;


    public Wrapper(int id, Size size, Color color, float price) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "id=" + id +
                ", size=" + size +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
