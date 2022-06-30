package lesson1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Plane plane = new Plane();

//        Runner[] runners = {cat, dog, duck};
//        Flying[] flying = {duck, plane};

        plane.fly();
        doFly(plane);
        doFly(duck);

    }

    public static void doFly(Flying whatObject) {
        System.out.println("Подоготовка");
        whatObject.fly();
        System.out.println("Завершение");

    }
}
