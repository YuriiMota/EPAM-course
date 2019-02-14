package com.mota.task2;



import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Test {
    void getAnnotatedFild(Class someClass){
        List<Field>fields = new ArrayList<>(Arrays.asList(someClass.getDeclaredFields()));
         fields.stream()
                .filter(n->n.isAnnotationPresent(MyAnnotation.class))
                .collect(Collectors.toList()).forEach(System.out::println);


    }

    public static void main(String[] args) {
            Test test = new Test();
            test.getAnnotatedFild(TestAnnotation.class);


    }
}
