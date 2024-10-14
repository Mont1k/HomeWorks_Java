package homework5;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(100);
        boss.setDefenceType("Magical");

        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss defence type: " + boss.getDefenceType());

        Hero[] heroes = createHeroes();

        for (Hero hero : heroes) {
            System.out.println("Hero name: " + hero.getName() +
                    ", health: " + hero.getHealth() +
                    ", damage: " + hero.getDamage() +
                    ", super power: " + hero.getSuperPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero("Thor", 250, 30, "Thunder Strike");
        Hero hero2 = new Hero("Hulk", 300, 25); // Без суперспособности
        Hero hero3 = new Hero("Doctor Strange", 200, 20, "Time Manipulation");

        return new Hero[] {hero1, hero2, hero3};
    }
}
