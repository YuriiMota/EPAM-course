package com.mota.task4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ThreeMathods {
    public int firstMethod(int a, int b) {
        return a + b;
    }

    public void secondMethod(String s) {
        System.out.println("Second:"+s.length());
    }

    public boolean thirdMethod(int a) {
        return a > 5;
    }

    static void invokeMethods(ThreeMathods threeMathods, int a, int b, String S,int c) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        Class someClass = ThreeMathods.class;
        Method firstMethod = someClass.getDeclaredMethod("firstMethod", int.class, int.class);
        System.out.println("First method:"+firstMethod.invoke(threeMathods,a,b));
        Method secondMethod = someClass.getDeclaredMethod("secondMethod",String.class);
        secondMethod.invoke(threeMathods,S);
        Method thirdMethod = someClass.getDeclaredMethod("thirdMethod",int.class);
        System.out.println("Third Method:"+thirdMethod.invoke(threeMathods,c));

    }

    public static void main(String[] args)  throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
        ThreeMathods threeMathods = new ThreeMathods();
        invokeMethods(threeMathods,12,4,"Hello",5);

    }
}
