package com.mota.task2;

public class TestAnnotation {
    @MyAnnotation(value="Name")
    String s;
    @MyAnnotation
    int age;
    int phone;
    @MyAnnotation(value="Male/Female")
    char sex;

    public TestAnnotation(String s, int age, int phone, char sex) {
        this.s = s;
        this.age = age;
        this.phone = phone;
        this.sex = sex;
    }


}
