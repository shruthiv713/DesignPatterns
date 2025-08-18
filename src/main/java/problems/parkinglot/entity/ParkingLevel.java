package problems.parkinglot.entity;

import problems.parkinglot.vehicle.Vehicle;
import problems.parkinglot.vehicle.VehicleSize;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ParkingLevel {
    private int levelNumber;
    private int availableSpots;
    private int totalSpots;
    List<ParkingSpot> parkingSpots;

    public ParkingLevel(int levelNumber ) {
        this.levelNumber = levelNumber;
    }
    public void addParkingSpot(ParkingSpot parkingSpot) {
        if (parkingSpots == null) {
            parkingSpots = new java.util.ArrayList<>();
        }
        parkingSpots.add(parkingSpot);
    }
    public Optional<ParkingSpot> findAvailableSpot(Vehicle vehicle) {

        if (parkingSpots == null || parkingSpots.isEmpty()) {
            return Optional.empty();
        }
        return parkingSpots.stream().filter(spot -> spot.isAvailable() && spot.canFitVehicle(vehicle))
                .min(Comparator.comparing(ParkingSpot::getSpotSize));
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public int getTotalSpots() {
        return totalSpots;
    }

    public void displayAvailability() {
        Map<VehicleSize, Long> availabilityMap = parkingSpots.stream()
                .filter(ParkingSpot::isAvailable)
                .collect(Collectors.groupingBy(ParkingSpot::getSpotSize, Collectors.counting()));

       for(VehicleSize vehicle:VehicleSize.values()) {
            long count = availabilityMap.getOrDefault(vehicle, 0L);
            System.out.println("Available spots for " + vehicle + ": " + count);
        }
        if (availabilityMap.isEmpty()) {
            System.out.println("No available spots in this level.");
        } else {
            System.out.println("Total available spots: " + availabilityMap.values().stream().mapToLong(Long::longValue).sum());
       }
    }

}
