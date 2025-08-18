package problems.parkinglot.strategy.parking;

import problems.parkinglot.entity.ParkingLevel;
import problems.parkinglot.entity.ParkingSpot;
import problems.parkinglot.vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

public class FirstFitParkingStrategy implements ParkingStrategy {
    @Override
    public Optional<ParkingSpot> findAvailableSpot(List<ParkingLevel> parkingLevels, Vehicle vehicle) {
        Optional<ParkingSpot> parkingSpot = Optional.empty();
        for(ParkingLevel parkingLevel:parkingLevels) {
            parkingSpot = parkingLevel.findAvailableSpot(vehicle);
            if (parkingSpot.isPresent()) {
                return parkingSpot; // Return the first available spot found
            }
        }
        return parkingSpot; // If no spot is found, return empty
    }
}
