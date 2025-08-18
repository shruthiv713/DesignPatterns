package problems.parkinglot;

import problems.parkinglot.entity.ParkingLevel;
import problems.parkinglot.entity.ParkingSpot;
import problems.parkinglot.strategy.fee.VehicleBasedFeeStrategy;
import problems.parkinglot.strategy.parking.BestFitParkingStrategy;
import problems.parkinglot.strategy.parking.FirstFitParkingStrategy;
import problems.parkinglot.vehicle.MotorCycle;
import problems.parkinglot.vehicle.Vehicle;
import problems.parkinglot.vehicle.VehicleSize;

public class ParkingLotDemo {
    public static void main(String[] args) {

        ParkingLotSystem parkingLot = ParkingLotSystem.getInstance();
        parkingLot.setParkingStrategy(new BestFitParkingStrategy());
        parkingLot.setFeeStrategy(new VehicleBasedFeeStrategy());

        initializeParkingLot(parkingLot);
        Vehicle motorCycle = new MotorCycle("ABC123");
        parkingLot.parkVehicle(motorCycle);
       // parkingLot.unparkVehicle(motorCycle);
        Vehicle motorCycle2 = new MotorCycle("XYZ789");
        parkingLot.parkVehicle(motorCycle2);
        parkingLot.unparkVehicle(motorCycle2);

    }

    private static void initializeParkingLot(ParkingLotSystem parkingLot) {
        ParkingLevel floor1 = new ParkingLevel(1);
        floor1.addParkingSpot(new ParkingSpot(VehicleSize.SMALL, "F1-S1"));
        floor1.addParkingSpot(new ParkingSpot(VehicleSize.MEDIUM, "F1-M1"));
        floor1.addParkingSpot(new ParkingSpot(VehicleSize.LARGE, "F1-L1"));
       floor1.addParkingSpot(new ParkingSpot(VehicleSize.MEDIUM, "F1-M2"));
        floor1.addParkingSpot(new ParkingSpot(VehicleSize.LARGE, "F1-L2"));

        parkingLot.addParkingLevel(floor1);
        ParkingLevel floor2 = new ParkingLevel(2);
        floor2.addParkingSpot(new ParkingSpot(VehicleSize.SMALL, "F2-S1"));
        floor2.addParkingSpot(new ParkingSpot(VehicleSize.MEDIUM, "F2-M1"));
        floor2.addParkingSpot(new ParkingSpot(VehicleSize.LARGE, "F2-L1"));
        parkingLot.addParkingLevel(floor2);
    }
}
