package lesson1;

public class Duck implements Flying, Runner, Jumper {
    @Override
    public void fly() {
        System.out.println("Утка полетела");
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }
}
