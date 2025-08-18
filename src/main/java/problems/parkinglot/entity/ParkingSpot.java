package problems.parkinglot.entity;

import problems.parkinglot.vehicle.Vehicle;
import problems.parkinglot.vehicle.VehicleSize;

public class ParkingSpot {
    VehicleSize spotSize;
    boolean isAvailable;
    String spotNumber;
    Vehicle parkedVehicle;

    public ParkingSpot(VehicleSize spotSize, String spotNumber) {
        this.spotSize = spotSize;
        this.isAvailable = true; // Initially all spots are available
        this.spotNumber = spotNumber;
    }
    public VehicleSize getSpotSize() {
        return spotSize;
    }
    public String getSpotNumber() {
        return spotNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleSize().ordinal() <= this.spotSize.ordinal();
    }
    public void parkVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.isAvailable = false; // Spot is now occupied
    }

    public void unparkVehicle() {
        this.parkedVehicle = null;
        this.isAvailable = true; // Spot is now available
    }

}
