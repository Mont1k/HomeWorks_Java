package homework6;

public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon(WeaponType.SWORD, "Long two-handed sword");
        Weapon bow = new Weapon(WeaponType.BOW, "Very very good Bow");

        Boss boss = new Boss(1000, 150, sword);
        boss.printInfo();

        Skeleton skeleton1 = new Skeleton(300, 50, bow, 25);
        Skeleton skeleton2 = new Skeleton(280, 45, bow, 20);

        System.out.println("\nSkeleton 1:");
        skeleton1.printInfo();

        System.out.println("\nSkeleton 2:");
        skeleton2.printInfo();
    }
}

