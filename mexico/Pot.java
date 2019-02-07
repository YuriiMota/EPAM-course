package epam.mexico;

public class Pot {


    private int id;
    private Size size;
    private Color color;

    public Pot(int id, Size size, Color color) {
        this.id = id;
        this.size = size;
        this.color = color;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pot{" +
                "id=" + id +
                ", price=" + size.getPrice()+
                ", size=" + size +
                ", color=" + color +
                '}';
    }
}
