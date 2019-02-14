package com.mota.task3;

import com.mota.task2.MyAnnotation;
import com.mota.task2.TestAnnotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAnnotion {
    static void getValue(Class someClass) {
        List<Field> fields = new ArrayList<>(Arrays.asList(someClass.getDeclaredFields()));

        fields.stream()
                .filter(n->n.isAnnotationPresent(MyAnnotation.class))
                .map(f -> f.getAnnotationsByType(MyAnnotation.class))
                .forEach(s -> System.out.println(s[0].value()));
    }
    public static void main(String[] args) {

        getValue(TestAnnotation.class);
    }
}
