package homeworklesson1;

public class Human implements Participants {
    private int maxDistance;
    private double maxHeight;

    public Human (int maxDistance, double maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run() {
        System.out.println("Человек побежал");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгнул");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public double getMaxHeight() {
        return maxHeight;
    }
}
