package epam.ConcertHall;

public class Event {
    String name;
    float price;
    int actor;
    int musician;

    public Event(String name, float price, int actor, int musician) {
        this.name = name;
        this.price = price;
        this.actor = actor;
        this.musician = musician;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getActor() {
        return actor;
    }

    public int getMusician() {
        return musician;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", actor=" + actor +
                ", musician=" + musician +
                '}';
    }
}
