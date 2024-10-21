package homework7;

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(250, 30),
                new Medic(200, 10, 50),
                new Warrior(300, 40)
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}
