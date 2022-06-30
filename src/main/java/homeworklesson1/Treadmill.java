package homeworklesson1;

public class Treadmill implements Obstacles {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public void overcomeObstacle(Participants p) {
        p.run();
        if (distance > p.getMaxDistance()) {
            System.out.println("Участник сошел с дистанции");
        } else {
            System.out.println("Участник преодолел дистанцию");
        }
    }
    public void overcomeObstacleArr(Participants participants) {
        Wall wall = new Wall(2);
        participants.run();
        if (distance > participants.getMaxDistance()) {
            System.out.println("Участник сошел с дистанции");
        } else {
            System.out.println("Участник преодолел дистанцию");
            participants.jump();
            if (wall.getHeight() > participants.getMaxHeight()) {
                System.out.println("Участник не справился с препятствием");
            } else {
                System.out.println("Участник преодолел препятствие");
            }
        }
    }
}
