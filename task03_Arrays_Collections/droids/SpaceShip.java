package epam.droids;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpaceShip {
    List<? extends Droid> droid;

    public SpaceShip(List<? extends Droid> droid) {
        this.droid = droid;
    }

    public List<? extends Droid> getDroid() {
        return droid;
    }

    public void setDroid(List<? extends Droid> droid) {
        this.droid = droid;
    }
    public static void main(String[] args){
        Droid droid = new Droid("TT32", 230);
        Droid battleDroid = new BattleDroid("BigRo",3000,"Gunn-32");
        ArrayList<Droid> droids = new ArrayList<>(Arrays.asList(droid,battleDroid));
        SpaceShip droidSpaceShip = new SpaceShip(droids);
        SpaceShip battleDroidSpaceShip = new SpaceShip(Arrays.asList(battleDroid));
        System.out.println(droidSpaceShip.getDroid());
        System.out.println(battleDroidSpaceShip.getDroid());

    }
}
