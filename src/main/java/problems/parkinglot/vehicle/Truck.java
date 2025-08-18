package problems.parkinglot.vehicle;

public class Truck extends Vehicle {

    public Truck(String licensePlate) {
        this.licensePlate = licensePlate;
        this.vehicleSize = VehicleSize.LARGE; // Assuming all cars are compact for simplicity
    }

    @Override
    public String toString() {
        return "Truck{" +
                "licensePlate='" + licensePlate + '\'' +
                ", size=" + vehicleSize.name() +
                '}';
    }
}
