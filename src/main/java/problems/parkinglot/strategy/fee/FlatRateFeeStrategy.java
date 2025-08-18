package problems.parkinglot.strategy.fee;

import problems.parkinglot.entity.ParkingTicket;

public class FlatRateFeeStrategy implements FeeStrategy{

    private static final double RATE_PER_HOUR = 10.0;


    /**
     * Calculates the parking fee based on a flat rate.
     *
     * @param parkingTicket The parking ticket containing the vehicle and parking details.
     * @return The calculated fee based on the duration of parking.
     */

    @Override
    public double calculateFee(ParkingTicket parkingTicket) {
        // Assuming a flat rate of $10 for parking
        double flatRate = 10.0;
        long duration = parkingTicket.getExitTime()-parkingTicket.getIssuedTime();
        long hours = duration / (1000 * 60 * 60) + 1; // Convert duration from milliseconds to hours
        return hours * flatRate; // Convert duration from milliseconds to hours

    }
}
