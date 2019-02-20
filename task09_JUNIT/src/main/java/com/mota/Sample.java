package com.mota;

public class Sample {

    private int value1;
    private int value2;





    public Sample(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    boolean isOk() {
        return value1 > 0;
    }

    public int add() {

        return value1 + value2;
    }

    public int addToValue1(int value) {
        return value + value1;
    }

    public void getAbbracadabra(int value) throws Exception {
        if (value == 4) {
            throw new Exception("Abbracadabra");
        }


    }
}
