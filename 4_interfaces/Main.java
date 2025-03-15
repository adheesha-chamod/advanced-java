interface Vehical {
    static final int MIN_SPEED = 0;
    static final int MAX_SPEED = 100;

    void start();
    void stop();
}

interface Car extends Vehical {
    void drive();
}

interface Bike extends Vehical {
    void ride();
}

class NissanLeaf implements Car {
    @Override
    public void start() {
        System.out.println("NissanLeaf is starting");
    }

    @Override
    public void stop() {
        System.out.println("NissanLeaf is stopping");
    }

    @Override
    public void drive() {
        System.out.println("NissanLeaf is driving in speed between " + MIN_SPEED + " and " + MAX_SPEED);
    }
}

class YamahaFZ implements Bike {
    @Override
    public void start() {
        System.out.println("YamahaFZ is starting");
    }

    @Override
    public void stop() {
        System.out.println("YamahaFZ is stopping");
    }

    @Override
    public void ride() {
        System.out.println("YamahaFZ is rideing in speed between " + MIN_SPEED + " and " + MAX_SPEED);
    }
}

public class Main {
    public static void startVehical(Vehical vehical) {
        vehical.start();
    }

    public static void stopVehical(Vehical vehical) {
        vehical.stop();
    }

    public static void main(String[] args) {
        System.out.println("Minimum speed of vehical: " + Vehical.MIN_SPEED);
        System.out.println("Maximum speed of vehical: " + Vehical.MAX_SPEED);
        
        Car nissanLeaf = new NissanLeaf();
        nissanLeaf.drive();

        Bike yamahaFZ = new YamahaFZ();
        yamahaFZ.ride();

        startVehical(new NissanLeaf());
        startVehical(new YamahaFZ());

        stopVehical(new NissanLeaf());
        startVehical(new YamahaFZ());
    }    
}
