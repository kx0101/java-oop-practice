public class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }
}

public interface FuelConsumable {
    void refuel();
}

public class Car extends Vehicle implements FuelConsumable {
    @Override
    public void refuel() {
        System.out.println("Car refueled");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Outputs: Vehicle started
        car.stop();   // Outputs: Vehicle stopped
        car.refuel(); // Outputs: Car refueled
    }
}
