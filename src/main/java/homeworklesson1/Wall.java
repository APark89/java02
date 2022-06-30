package homeworklesson1;


public class Wall implements Obstacles {

    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public void overcomeObstacle(Participants p) {
        p.jump();
        if (height > p.getMaxHeight()) {
            System.out.println("Участник не справился с препятствием");
        } else {
            System.out.println("Участник преодолел препятствие");
        }
    }

    @Override
    public void overcomeObstacleArr(Participants participants) {
        System.out.println();

    }

    public double getHeight () {
        return height;
    }
}
