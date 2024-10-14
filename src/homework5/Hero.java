package homework5;

public class Hero {
    private String name;
    private int health;
    private int damage;
    private String superPower;


    public Hero(String name, int health, int damage, String superPower) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }


    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.superPower = "No superpower";
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}
