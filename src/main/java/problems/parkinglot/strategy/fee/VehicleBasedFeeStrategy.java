package problems.parkinglot.strategy.fee;

import problems.parkinglot.entity.ParkingTicket;
import problems.parkinglot.vehicle.VehicleSize;

import java.util.Map;

public class VehicleBasedFeeStrategy implements FeeStrategy{

    private static final double RATE_PER_HOUR = 10.0;

    private static Map<VehicleSize, Double> vehicleRateMap = Map.of(
            VehicleSize.SMALL, 5.0,
            VehicleSize.MEDIUM, 10.0,
            VehicleSize.LARGE, 15.0
    );
    /**
     * Calculates the parking fee based on a flat rate.
     *
     * @param parkingTicket The parking ticket containing the vehicle and parking details.
     * @return The calculated fee based on the duration of parking.
     */

    @Override
    public double calculateFee(ParkingTicket parkingTicket) {
        // Assuming a flat rate of $10 for parking
        double rate = vehicleRateMap.get(parkingTicket.getVehicle().getVehicleSize());
        long duration = parkingTicket.getExitTime()-parkingTicket.getIssuedTime();
        long hours = duration / (1000 * 60 * 60) + 1; // Convert duration from milliseconds to hours
        return hours * rate; // Convert duration from milliseconds to hours

    }
}
