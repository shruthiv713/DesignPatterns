package problems.parkinglot;

import problems.parkinglot.entity.ParkingLevel;
import problems.parkinglot.entity.ParkingSpot;
import problems.parkinglot.entity.ParkingTicket;
import problems.parkinglot.strategy.fee.FeeStrategy;
import problems.parkinglot.strategy.fee.VehicleBasedFeeStrategy;
import problems.parkinglot.strategy.parking.BestFitParkingStrategy;
import problems.parkinglot.strategy.parking.ParkingStrategy;
import problems.parkinglot.vehicle.Vehicle;

import java.util.*;

public class ParkingLotSystem {

    private static ParkingLotSystem parkingLotSystem;
    private ParkingStrategy parkingStrategy;
    Map<String, ParkingTicket> activeTickets;
    private FeeStrategy feeStrategy;

    private ParkingLotSystem() {
        // Private constructor to prevent instantiation
        activeTickets = new HashMap<>();
        parkingStrategy = new BestFitParkingStrategy();
        feeStrategy = new VehicleBasedFeeStrategy();
        parkingLevels = new ArrayList<>();
    }

    public void setParkingStrategy(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }

    public void setFeeStrategy(FeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    public static ParkingLotSystem getInstance() {
        if(parkingLotSystem == null) {
            parkingLotSystem = new ParkingLotSystem();
        }
        return parkingLotSystem;
    }

    List<ParkingLevel> parkingLevels;
    public void addParkingLevel(ParkingLevel parkingLevel) {
        parkingLevels.add(parkingLevel);
    }

    public Optional<ParkingTicket> parkVehicle(Vehicle vehicle) {
            Optional<ParkingSpot> parkingSpot = parkingStrategy.findAvailableSpot(parkingLevels, vehicle);
            if (parkingSpot.isPresent()) {
                ParkingSpot spot = parkingSpot.get();
                spot.parkVehicle(vehicle);
                ParkingTicket ticket = new ParkingTicket( vehicle, spot);
                activeTickets.put(vehicle.getLicensePlate(), ticket);
                System.out.println("Vehicle " + vehicle.getLicensePlate() + " parked in parking spot : " + parkingSpot.get().getSpotNumber());
                return Optional.of(ticket);
            }
        System.out.println("All parking spots are full for vehicle with license plate: " + vehicle.getLicensePlate());
        System.out.println("Please try again later.");
        return Optional.empty();
    }

    public void unparkVehicle(Vehicle vehicle) {
        ParkingTicket ticket = activeTickets.get(vehicle.getLicensePlate());
        if (ticket != null) {
            ticket.setExitTime(System.currentTimeMillis());

            ParkingSpot parkingSpot = ticket.getParkingSpot();
            parkingSpot.unparkVehicle();
            activeTickets.remove(vehicle.getLicensePlate());
            double fee = feeStrategy.calculateFee(ticket);
            System.out.println("Vehicle " + vehicle.getLicensePlate() + " exited from spot "+parkingSpot.getSpotNumber()+". Fee: " + fee);
        } else {
            System.out.println("No active ticket found for vehicle with license plate: " + vehicle.getLicensePlate());
        }
    }

}
