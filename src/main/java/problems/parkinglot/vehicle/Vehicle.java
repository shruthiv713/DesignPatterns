package problems.parkinglot.vehicle;

public abstract class Vehicle {
    String licensePlate;
    VehicleSize vehicleSize;

    public String getLicensePlate() {
        return licensePlate;
    }
    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }

}
