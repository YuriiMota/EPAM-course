package com.mota.Task1;

import java.io.Serializable;

public class Droid implements Serializable {
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
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
