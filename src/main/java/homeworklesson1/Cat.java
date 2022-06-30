package homeworklesson1;

public class Cat implements Participants {
    private int maxDistance;
    private double maxHeight;

    public Cat(int maxDistance, double maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run() {
        System.out.println("Кот побежал");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгнул");

    }

    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public double getMaxHeight() {
        return maxHeight;
    }
}
