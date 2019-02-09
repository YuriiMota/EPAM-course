package epam.SimpleTasks.compareStrings;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Countries {
    public static void main(String[] args) {
        List<CompareValues> countries = new ArrayList<>();
        countries.add(new CompareValues("Norway","Oslo"));
        countries.add(new CompareValues("Poland","Warsaw"));
        countries.add(new CompareValues("Ukraine","Kiev"));
        countries.add(new CompareValues("Italy","Rome"));
        countries.add(new CompareValues("UK","London"));
        countries.add(new CompareValues("France","Paris"));
        PersonalComparator pcomp = new PersonalComparator();
        countries.sort(pcomp);
        System.out.println("Order by country");

        System.out.println(countries);
        System.out.println("Order by capitals");
        
        countries.sort(CompareValues::compareTo);
        System.out.println(countries);


    }
}
