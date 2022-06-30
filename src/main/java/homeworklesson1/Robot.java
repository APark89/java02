package homeworklesson1;

public class Robot implements Participants {
    private int maxDistance;
    private double maxHeight;


    public Robot(int maxDistance, double maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run() {
        System.out.println("Робот побежал");
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгнул");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public double getMaxHeight() {
        return maxHeight;
    }
}
