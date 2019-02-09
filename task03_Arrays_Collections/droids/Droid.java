package epam.droids;

import java.util.Objects;

public class Droid implements Comparable<Droid> {
    private String name;
    private int power;

    public Droid(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int compareTo(Droid o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Droid droid = (Droid) o;
        return power == droid.power &&
                Objects.equals(name, droid.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power);
    }
}
