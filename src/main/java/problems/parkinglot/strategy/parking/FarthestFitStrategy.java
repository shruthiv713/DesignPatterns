package problems.parkinglot.strategy.parking;

import problems.parkinglot.entity.ParkingLevel;
import problems.parkinglot.entity.ParkingSpot;
import problems.parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FarthestFitStrategy implements ParkingStrategy {
    @Override
    public Optional<ParkingSpot> findAvailableSpot(List<ParkingLevel> parkingLevels, Vehicle vehicle) {
        List<ParkingLevel> reversedFloors = new ArrayList<>(parkingLevels);
        Collections.reverse(reversedFloors);

        for (ParkingLevel floor : reversedFloors) {
            Optional<ParkingSpot> spot = floor.findAvailableSpot(vehicle);
            if (spot.isPresent()) {
                return spot;
            }
        }
        return Optional.empty();
    }

}
