package lld.design.parkinglotapplication.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ParkingLot extends BaseModel{
    private String address;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<VehicleType> allowedVehicleTypes;
    private ParkingLotStatus parkingLotStatus;
    private SlotAssignmentStrategyType slotAssignmentStrategyType;
}
