package problems.parkinglot.vehicle;

public class MotorCycle extends Vehicle {


    public MotorCycle(String licensePlate) {
        this.licensePlate = licensePlate;
        this.vehicleSize = VehicleSize.SMALL; // Assuming all cars are compact for simplicity
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", size=" + vehicleSize.name() +
                '}';
    }
}
