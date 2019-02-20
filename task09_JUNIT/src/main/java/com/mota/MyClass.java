package com.mota;

public class MyClass {
    public MyInterface myInterface;

    public MyClass(MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    public double add(double input1, double input2) {
        return myInterface.add(input1, input2);
    }

    public double subtract(double input1, double input2) {
        return myInterface.subtract(input1, input2);
    }

    public double multiply(double input1, double input2) {
        return myInterface.multiply(input1, input2);
    }

    public double divide(double input1, double input2) {
        return myInterface.divide(input1, input2);
    }
}
