package epam.MusicShop;

import java.util.Comparator;

public class PersonalComparator implements Comparator<MusicInstrument> {
    public int compare(MusicInstrument a, MusicInstrument b){

        if(a.getWeight()> b.getWeight())
            return 1;
        else if(a.getWeight()< b.getWeight())
            return -1;
        else
            return 0;
    }
}
