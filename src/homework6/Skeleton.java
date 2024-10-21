package homework6;

public class Skeleton extends Boss {
    private int arrowsCount;

    public Skeleton(int health, int damage, Weapon weapon, int arrowsCount) {
        super(health, damage, weapon);
        this.arrowsCount = arrowsCount;
    }

    public int getArrowsCount() {
        return arrowsCount;
    }

    public void setArrowsCount(int arrowsCount) {
        this.arrowsCount = arrowsCount;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Arrows count: " + arrowsCount);
    }
}

