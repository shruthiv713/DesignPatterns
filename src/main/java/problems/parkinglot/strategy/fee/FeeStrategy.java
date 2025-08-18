package problems.parkinglot.strategy.fee;

import problems.parkinglot.entity.ParkingTicket;

public interface FeeStrategy {
    double calculateFee(ParkingTicket parkingTicket) ;
}
