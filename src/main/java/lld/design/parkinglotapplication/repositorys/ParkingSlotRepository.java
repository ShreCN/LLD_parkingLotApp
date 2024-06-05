package lld.design.parkinglotapplication.repositorys;

import lld.design.parkinglotapplication.models.*;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class ParkingSlotRepository {
    private VehicleType vehicleType;
    private SlotStatus slotStatus;
    private Long slotNumber;
    private ParkingFloor floor;

    HashMap<Long, ParkingSlot> parkingSlotHashMap = new HashMap<>();

    public ParkingSlot getParkingSlotById(Long slotNumber){
        ParkingFloor parkingFloor = new ParkingFloor();// for simplicity we are not passing any values
        ParkingSlot parkingSlot = new ParkingSlot(VehicleType.Bike, SlotStatus.OPEN, 1L, parkingFloor);
        parkingSlotHashMap.put(1L, parkingSlot);
        return parkingSlotHashMap.get(slotNumber);
    }

}
