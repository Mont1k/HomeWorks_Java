package homework7;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, "Magic Power");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил супер способность FIREBALL");
    }
}