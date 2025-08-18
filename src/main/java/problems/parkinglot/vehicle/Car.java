package problems.parkinglot.vehicle;

public class Car extends Vehicle {

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.vehicleSize = VehicleSize.MEDIUM; // Assuming all cars are compact for simplicity
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", size=" + vehicleSize.name() +
                '}';
    }
}
