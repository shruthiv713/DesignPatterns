package problems.parkinglot.strategy.parking;

import problems.parkinglot.entity.ParkingLevel;
import problems.parkinglot.entity.ParkingSpot;
import problems.parkinglot.vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

public class BestFitParkingStrategy implements ParkingStrategy {
    @Override
    public Optional<ParkingSpot> findAvailableSpot(List<ParkingLevel> parkingLevels, Vehicle vehicle) {
        Optional<ParkingSpot> parkingSpot = Optional.empty();
        for(ParkingLevel level : parkingLevels) {
            Optional<ParkingSpot> spot = level.findAvailableSpot(vehicle);
            if (spot.isPresent()) {
                if (parkingSpot.isEmpty() || spot.get().getSpotSize().ordinal() < parkingSpot.get().getSpotSize().ordinal()) {
                    parkingSpot = spot;
                }
            }
        }
        return parkingSpot;
    }
}
