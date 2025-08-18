package problems.parkinglot.strategy.parking;

import problems.parkinglot.entity.ParkingLevel;
import problems.parkinglot.entity.ParkingSpot;
import problems.parkinglot.vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

public interface ParkingStrategy {

    Optional<ParkingSpot> findAvailableSpot(List<ParkingLevel> parkingLevels, Vehicle vehicle);

}
