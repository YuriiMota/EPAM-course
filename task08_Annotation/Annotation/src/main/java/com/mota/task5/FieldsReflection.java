package com.mota.task5;

import java.lang.reflect.Field;


public class FieldsReflection {
    int a;
    String s;

    public FieldsReflection(int a) {
        this.a = a;
    }

    public FieldsReflection(int a, String s) {
        this.a = a;
        this.s = s;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException{
            FieldsReflection test = new FieldsReflection(1,"s");

            Field field =test.getClass().getDeclaredField("a");
            if(field.getType().equals(int.class)){
                field.setInt(test,23);
            }
        System.out.println(test.a);


    }
}
