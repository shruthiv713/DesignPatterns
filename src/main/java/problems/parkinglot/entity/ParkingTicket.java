package problems.parkinglot.entity;

import problems.parkinglot.vehicle.Vehicle;

import java.util.Date;
import java.util.UUID;

public class ParkingTicket {
    String ticketNumber;
    Vehicle vehicle;
    long issuedTime;
    ParkingSpot parkingSpot;
    long exitTime;

    public ParkingTicket( Vehicle vehicle, ParkingSpot parkingSpot) {
        this.ticketNumber = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.issuedTime = new Date().getTime();
        this.parkingSpot = parkingSpot;
    }
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setExitTime(long exitTime) {
        this.exitTime = exitTime;
    }

    public long getIssuedTime() {
        return issuedTime;
    }
    public long getExitTime() {
        return exitTime;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
