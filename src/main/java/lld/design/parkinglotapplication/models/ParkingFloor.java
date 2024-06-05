package lld.design.parkinglotapplication.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingFloor extends BaseModel{
    private List<ParkingSlot> parkingSlots;
    private Long floorNumber;
    private parkingFloorStatus parkingFloorStatus;
    private List<VehicleType> allowedVehicleTypes;
}
