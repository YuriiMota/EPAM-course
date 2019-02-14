package com.mota.task6;

import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;
import java.util.Arrays;

public class InvokeReflection {
    void myMethod(String a, int... args) {
        System.out.println("a= " + a + " args=" + Arrays.toString(args));
    }

    void myMethod(String... args) {
        System.out.println("args= " + Arrays.toString(args));
    }


    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        InvokeReflection invokeReflection = new InvokeReflection();
        Method method = invokeReflection.getClass().getDeclaredMethod("myMethod", String.class, int[].class);
        method.invoke(invokeReflection, "First invoke", new int[]{2, 3, 4, 5});
        method = invokeReflection.getClass().getDeclaredMethod("myMethod", String[].class);
        method.invoke(invokeReflection, new Object[]{new String[]{"Second invoke", "Refletion"}});


    }
}
