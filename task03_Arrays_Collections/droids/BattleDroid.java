package epam.droids;

public class BattleDroid extends Droid {
 private String weapon;

    public BattleDroid(String name, int power, String weapon) {
        super(name, power);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "BattleDroid{" +
                "weapon='" + weapon + '\'' +
                '}';
    }

}
