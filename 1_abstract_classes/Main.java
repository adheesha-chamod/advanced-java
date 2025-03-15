abstract class Car {
    // abstract class
    abstract public void drive();

    public void playMusic() {
        System.out.println("Playing music...");
    }
}

class WagonR extends Car {
    @Override
    public void drive() {
        System.out.println("Driving...");
    }

    public void accelarate() {
        System.out.println("Accelarating...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new WagonR();
        car.drive();
        car.playMusic();
        // car.accelarate();

        WagonR wagonR = new WagonR();
        wagonR.drive();
        wagonR.playMusic();
        wagonR.accelarate();
    }
}