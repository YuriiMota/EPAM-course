package com.mota.Task1;

import java.io.*;
import java.util.ArrayList;

import java.util.List;


public class SpaceShip implements Serializable {
    private transient int speed;
    private String name;
    List<Droid> droid;

    public SpaceShip(int speed, String name, List<Droid> droid) {
        this.speed = speed;
        this.name = name;
        this.droid = droid;
    }

    public List<Droid> getDroid() {
        return droid;
    }

    public void setDroid(List<Droid> droid) {
        this.droid = droid;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", droid=" + droid +
                '}';
    }

    static void writeToFile(SpaceShip droidSpaceShip) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("droids.dat"))) {
            outputStream.writeObject(droidSpaceShip);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("File has been written");

    }

    static void readFromFile() {
        SpaceShip droidSpaceShip2 = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("droids.dat"))) {
            droidSpaceShip2 = (SpaceShip) objectInputStream.readObject();
        } catch (ClassNotFoundException | IOException ex) {
            ex.printStackTrace();
        }

        System.out.println(droidSpaceShip2);
        System.out.println("File has been read");
    }

    public static void main(String[] args) {
        List<Droid> droid = new ArrayList<>();
        droid.add(new Droid("TT32", 230));
        droid.add(new Droid("MM1", 100));
        SpaceShip droidSpaceShip = new SpaceShip(20, "Ship1", droid);
        System.out.println(droidSpaceShip);

        writeToFile(droidSpaceShip);
        readFromFile();
    }
}
