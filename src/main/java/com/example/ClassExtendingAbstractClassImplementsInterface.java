abstract class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }

    public abstract void stop();
}

interface FuelConsumable {
    void refuel();
}

class Car extends Vehicle implements FuelConsumable {
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void refuel() {
        System.out.println("Car refueled");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Outputs: Vehicle started
        car.stop();   // Outputs: Car stopped
        car.refuel(); // Outputs: Car refueled
    }
}
