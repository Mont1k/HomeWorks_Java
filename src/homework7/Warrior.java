package homework7;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, "Physical Power");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил супер способность CRITICAL DAMAGE");
    }
}