package epam.SimpleTasks;

import java.util.ArrayList;
import java.util.List;

public class ListStringIntoInteger {
    public static void main(String[] args) {
        List<Integer> integer = new ArrayList<>();
        List list = integer;
        list.add("String into Integer done!");
        
        String s = String.class.cast(integer.get(0));
        System.out.println(s);
    }
}
