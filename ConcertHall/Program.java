package epam.ConcertHall;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[]args){
        List<Event> events = new ArrayList<Event>(){{
            add(new CircusShow("AfricaCircus",110.00f,23,0));
            add(new CoverMusic("ElvisCoverNighr",240.00f,43,21));
            add(new Opera("Vivaldi",230.00f,45,5));
            add(new Theater("ThreeMates",65.00f,13,0));
            add(new SymphonyOrchestra("SymphonyNightShow",110.00f,11,34));
        }


        };
        PersonComparator personComparator = new PersonComparator();
        events.sort(personComparator);
        for (Event ev:
            events ) {
            if( ev.getMusician()>0)
                System.out.println(ev);

        }

        }


}
