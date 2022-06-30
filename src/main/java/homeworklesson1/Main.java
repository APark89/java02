package homeworklesson1;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(2000, 1.5);
        Robot robot = new Robot(5000, 3.0);
        Cat cat = new Cat(500, 0.5);
        Wall wall = new Wall(2);
        Treadmill treadmill = new Treadmill(800);

        treadmill.overcomeObstacle(human);
        wall.overcomeObstacle(human);

        treadmill.overcomeObstacle(robot);
        wall.overcomeObstacle(robot);

        treadmill.overcomeObstacle(cat);
        wall.overcomeObstacle(cat);

        System.out.println();

        Participants[] participants = {human, robot, cat};
        Obstacles[] obstacles = {treadmill, wall};

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                obstacles[j].overcomeObstacleArr(participants[i]);
            }
        }
    }
}
