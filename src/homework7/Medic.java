package homework7;

public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, "Healing");
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность HEALING");
    }

    public void increaseExperience() {
        this.healPoints += healPoints * 0.1;
        System.out.println("Количество очков лечения увеличено на 10%: " + healPoints);
    }

    public int getHealPoints() {
        return healPoints;
    }
}