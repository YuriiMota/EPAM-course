package com.mota.task7;

import com.mota.task5.FieldsReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class InfoClass {
    public static void info(Class someClass) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Full class name: " + someClass.getName() + "\n")
                .append("Class name: " + someClass.getSimpleName() + "\n")
                .append("Anonymous : " + someClass.isAnonymousClass() + "\n")
                .append("Annotation: " + someClass.isAnnotation() + "\n")
                .append("Interface: " + someClass.isInterface() + "\n")
                .append("Primitive: " + someClass.isPrimitive() + "\n")
                .append("Enum: " + someClass.isEnum() + "\n")
                .append("Local Class: " + someClass.isLocalClass() + "\n")
                .append("Array: " + someClass.isArray() + "\n")
                .append("Member Class: " + someClass.isMemberClass() + "\n");
        stringBuilder.append("\t Constructors\n");
        Constructor[] constructors = someClass.getConstructors();
        for (Constructor c : constructors) {
            stringBuilder.append(c).append("\n");
        }
        stringBuilder.append("\tMethods\n");
        Method[] methods = someClass.getDeclaredMethods();
        for (Method m : methods) {
            stringBuilder.append(m).append("\n");
        }
        stringBuilder.append("\tFields\n");

        Field[] fields = someClass.getDeclaredFields();
        for (Field f : fields) {
            stringBuilder.append(f).append("\n");
        }

        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {

        InfoClass.info(FieldsReflection.class);
    }
}
