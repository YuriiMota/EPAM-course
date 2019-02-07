package epam.ConcertHall;

import java.util.Comparator;

public class PersonComparator implements Comparator<Event> {

        public int compare(Event a, Event b) {

            if (a.getMusician() > b.getMusician())
                return 1;
            else if (a.getMusician() < b.getMusician())
                return -1;
            else
                return 0;
        }

}
