package epam.SimpleTasks.compareStrings;

import java.util.Comparator;

public class PersonalComparator implements Comparator<CompareValues> {
     public int compare(CompareValues a, CompareValues b){

            return a.getS2().compareTo(b.getS2());
        }

}
